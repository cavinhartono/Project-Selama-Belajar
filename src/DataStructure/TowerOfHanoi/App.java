package DataStructure.TowerOfHanoi;

class TowerOfHanoi {
  public void movedRod(int n, char from, char to, char aux) { 
    /* 
      n = jumlah donat yang diinginkan; from = asalnya; to = tujuan; aux = penampung 
    */
    if(n > 0) {
      movedRod(n - 1, from, aux, to);
      System.out.println("Perpindahan donat urutan " + n + " dari " + from + " ke " + to);
      movedRod(n - 1, aux, to, from);
    }
  }
}

public class App {
  public static void main(String[] args) {
    TowerOfHanoi obj = new TowerOfHanoi();
    obj.movedRod(4, 'A', 'C', 'B');
  }
}
