package SolveSudoku;

import java.awt.Robot;
import java.awt.event.KeyEvent;

class Main {
  // Inisialisasi Grid atau soal Sudoku
  static int[][] Grid = {
      { 5, 0, 0, /* | */ 6, 0, 0, /* | */ 0, 0, 0 },
      { 8, 0, 0, /* | */ 0, 0, 0, /* | */ 0, 9, 0 },
      { 0, 3, 0, /* | */ 0, 5, 2, /* | */ 0, 0, 4 },
      /* -----------+-----------------+--------------+ */
      { 0, 0, 0, /* | */ 7, 0, 0, /* | */ 0, 0, 1 },
      { 3, 0, 0, /* | */ 0, 6, 1, /* | */ 8, 0, 0 },
      { 0, 6, 0, /* | */ 4, 0, 0, /* | */ 0, 0, 0 },
      /* -----------+-----------------+--------------+ */
      { 0, 5, 0, /* | */ 0, 1, 3, /* | */ 0, 0, 2 },
      { 0, 0, 0, /* | */ 0, 0, 7, /* | */ 0, 0, 0 },
      { 0, 0, 2, /* | */ 0, 0, 0, /* | */ 4, 0, 0 }
  };

  // Nilai konstant untuk ukuran pada Grid
  public static int GRID_SIZE = 9;

  public static void main(String[] args) throws Exception {
    Thread.sleep(1000);
    solve();
  }

  /*
   * Mengecek angka pada baris dan kolom?
   * True, maka dimasukkan ke posisi yang sesuai
   * False, maka bilangan tersebut tidak diubah pada baris atau kolom
   */
  public static boolean isNumber(int x, int y, int number) throws Exception {
    for (int i = 0; i < GRID_SIZE; i++) {
      if (Grid[i][x] == number && i != y) {
        return false;
      }
    }

    for (int i = 0; i < GRID_SIZE; i++) {
      if (Grid[y][i] == number && i != x) {
        return false;
      }
    }

    int x0 = (x / 3) * 3;
    int y0 = (y / 3) * 3;

    for (int i = x0; i < x0 + 3; i++) {
      for (int j = y0; j < y0 + 3; j++) {
        if (Grid[j][i] == number) {
          return false;
        }
      }
    }

    return true;
  }

  // Mencari solusi Sudoku secara rekursi
  public static void solve() throws Exception {
    for (int y = 0; y < GRID_SIZE; y++) {
      for (int x = 0; x < GRID_SIZE; x++) {
        if (Grid[y][x] == 0) {
          for (int number = 1; number <= GRID_SIZE; number++) {
            if (isNumber(x, y, number)) {
              Grid[y][x] = number;
              solve();
              Grid[y][x] = 0;
            }
          }
          return;
        }
      }
    }
    print(Grid);
  }

  // Mencetak hasil secara otomatis
  public static void print(int[][] Grid) throws Exception {
    Robot rb = new Robot();
    for (int[] Row : Grid) {
      for (int number : Row) {
        if (number != 0) {
          rb.keyPress(KeyEvent.VK_0 + number);
          rb.keyRelease(KeyEvent.VK_0 + number);
        }
        rb.keyPress(KeyEvent.VK_RIGHT);
        rb.keyRelease(KeyEvent.VK_RIGHT);
      }
      for (int i = 0; i < GRID_SIZE; i++) {
        rb.keyPress(KeyEvent.VK_LEFT);
        rb.keyRelease(KeyEvent.VK_LEFT);
      }
      rb.keyPress(KeyEvent.VK_DOWN);
      rb.keyRelease(KeyEvent.VK_DOWN);
    }
  }
}
