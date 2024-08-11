package SudokuProblem;

class App {
  private static final int GRID_SIZE = 9; // Jumlah kolom dan baris

  public static void main(String[] args) {
    int Board[][] = {
        { 7, 0, 2, 0, 5, 0, 6, 0, 0 },
        { 0, 0, 0, 0, 0, 3, 0, 0, 0 },
        { 1, 0, 0, 0, 0, 9, 5, 0, 0 },
        { 8, 0, 0, 0, 0, 0, 0, 9, 0 },
        { 0, 4, 3, 0, 0, 0, 7, 5, 0 },
        { 0, 9, 0, 0, 0, 0, 0, 0, 8 },
        { 0, 0, 9, 7, 0, 0, 0, 0, 5 },
        { 0, 0, 0, 2, 0, 0, 0, 0, 0 },
        { 0, 0, 7, 0, 4, 0, 2, 0, 3 },
    };

    if (solveBoard(Board)) {
      System.out.println("Sukses.");
    } else {
      System.err.println("Gagal.");
    }

    print(Board);
  }

  public static boolean isNumberOfBox(int[][] Board, int number, int row, int column) {
    int localBoxRow = row - row % 3;
    int localBoxColumn = column - column % 3;

    for (int i = localBoxRow; i < (localBoxRow + 3); i++) {
      for (int j = localBoxColumn; j < (localBoxColumn + 3); j++) {
        if (Board[i][j] == number) {
          return true;
        }
      }
    }

    return false;
  }

  public static boolean isNumberOfRow(int[][] Board, int number, int row) {
    for (int i = 0; i < GRID_SIZE; i++) {
      if (Board[row][i] == number) {
        return true;
      }
    }

    return false;
  }

  public static boolean isNumberOfColumn(int[][] Board, int number, int column) {
    for (int i = 0; i < GRID_SIZE; i++) {
      if (Board[i][column] == number) {
        return true;
      }
    }

    return false;
  }

  public static boolean isValidPlacement(int[][] Board, int number, int row, int column) {
    return isCheck(Board, number, row, column);
  }

  public static boolean isCheck(int[][] Board, int number, int row, int column) {
    return !isNumberOfRow(Board, number, row)
        && !isNumberOfColumn(Board, number, column)
        && !isNumberOfBox(Board, number, row, column);
  }

  public static boolean solveBoard(int[][] Board) {
    for (int row = 0; row < GRID_SIZE; row++) {
      for (int column = 0; column < GRID_SIZE; column++) {
        if (Board[row][column] == 0) {
          for (int number = 1; number <= GRID_SIZE; number++) {
            if (isValidPlacement(Board, number, row, column)) {
              Board[row][column] = number;

              if (solveBoard(Board)) {
                return true;
              } else {
                Board[row][column] = 0;
              }
            }
          }
        }
      }
    }

    return false;
  }

  public static void print(int[][] Board) {
    for (int row = 0; row < GRID_SIZE; row++) {
      if (row % 3 == 0 && row != 0) {
        System.out.println("-----------");
      }
      for (int column = 0; column < GRID_SIZE; column++) {
        if (column % 3 == 0 && column != 0) {
          System.out.print("|");
        }
        System.out.print(Board[row][column]);
      }
      System.out.println();
    }
  }
}