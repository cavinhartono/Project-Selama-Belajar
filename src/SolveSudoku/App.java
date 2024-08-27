package SolveSudoku;

class App {
  public static int GRID_SIZE = 9;

  public static boolean solve(int[][] Grid, int row, int column) {
    if (row == GRID_SIZE - 1 && column == GRID_SIZE) {
      return true;
    }

    if (column == GRID_SIZE) {
      row++;
      column = 0;
    }

    if (Grid[row][column] > 0) {
      return solve(Grid, row, column + 1);
    }

    for (int number = 1; number <= GRID_SIZE; number++) {
      if (isSafe(Grid, row, column, number)) {
        Grid[row][column] = number;

        if (solve(Grid, row, column + 1)) {
          return true;
        }
      }
      Grid[row][column] = 0;
    }

    return false;
  }

  public static boolean isSafe(int[][] Grid, int row, int column, int number) {
    int start = row - row % 3, end = column - column % 3;

    for (int i = 0; i <= (GRID_SIZE - 1); i++) {
      if (Grid[row][i] == number || Grid[i][column] == number) {
        return false;
      }
    }

    for (int i = start; i < (start + 3); i++) {
      for (int j = end; j < (end + 3); j++) {
        if (Grid[i][j] == number) {
          return false;
        }
      }
    }

    return true;
  }

  public static void main(String[] args) {
    int Grid[][] = {
        { 0, 0, 0, /* | */ 7, 3, 0, /* | */ 0, 4, 5 },
        { 0, 0, 0, /* | */ 0, 1, 4, /* | */ 0, 2, 0 },
        { 0, 2, 1, /* | */ 0, 5, 6, /* | */ 0, 0, 8 },
        /* -----------+----------------+------------- */
        { 3, 6, 8, /* | */ 0, 0, 0, /* | */ 2, 0, 4 },
        { 1, 9, 0, /* | */ 4, 0, 5, /* | */ 0, 0, 0 },
        { 7, 0, 5, /* | */ 0, 6, 0, /* | */ 0, 1, 0 },
        /* -----------+----------------+------------- */
        { 0, 0, 4, /* | */ 3, 9, 7, /* | */ 0, 6, 0 },
        { 0, 0, 0, /* | */ 0, 0, 8, /* | */ 0, 0, 0 },
        { 0, 0, 7, /* | */ 0, 0, 0, /* | */ 0, 0, 0 },
    };

    if (solve(Grid, 0, 0)) {
      for (int i = 0; i < GRID_SIZE; i++) {
        if (i % 3 == 0 && i != 0) {
          System.out.println("---------+---------+---------");
        }
        for (int j = 0; j < GRID_SIZE; j++) {
          if (j % 3 == 0 && j != 0) {
            System.out.print("|");
          }
          System.out.print(" " + Grid[i][j] + " ");
        }
        System.out.println();
      }
    } else {
      System.err.println("Tidak ada solusi.");
    }
  }
}
