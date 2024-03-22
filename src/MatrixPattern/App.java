package MatrixPattern;

class SoalPattern {
  public void one(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        if (i >= j) {
          x[i][j] = 1;
        } else {
          x[i][j] = 0;
        }
      }
    }
    print(x);
  }
  
  public void two(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        if(i == j) {
          x[i][j] = 1;
        } else {
          x[i][j] = 0;
        }
      }
    }
    print(x);
  }

  public void three(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = i; j < x.length; j++) {
        if (i <= j) {
          x[i][j] = j + 1;
        } else {
          x[i][j] = 0;
        }
      }
    }
    print(x);
  }

  public void four(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        if(i == j) {
          x[i][j] = 0;
        } else {
          x[i][j] = 1;
        }
      }
    }
    print(x);
  }

  public void five(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        if (i >= j) {
          x[i][j] = i + 1;
        } else {
          x[i][j] = 0;
        }
      }
    }
    print(x);
  }

  public void six(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        if(i == j) {
          x[i][j] = i + 1;
        } else {
          x[i][j] = 0;
        }
      }
    }
    print(x);
  }

  public void print(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        System.out.print(x[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}

public class App {
  public static void main(String[] args) {
    SoalPattern obj = new SoalPattern();
    int[][] x = new int[4][4];

    obj.one(x);
    obj.two(x);
    obj.three(x);
    obj.four(x);
    obj.five(x);
    obj.six(x);
  }
}