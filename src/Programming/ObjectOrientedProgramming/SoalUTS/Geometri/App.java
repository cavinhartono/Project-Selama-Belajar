package Programming.ObjectOrientedProgramming.SoalUTS.Geometri;

public class App {
  private static Scanner ip = new Scanner(System.in);

  public static void main(String[] args) {
    int choice;

    System.out.println("1. Persegi");
    System.out.println("2. Lingkaran");
    System.out.println("3. Segitiga");

    choice = ip.nextInt();

    switch (choice) {
      case 1:
        BangunDatar persegi = new Persegi(4);
        System.out.println(persegi.hitungLuas());
        break;
      case 2:
        BangunDatar lingkaran = new Lingkaran(6);
        System.out.println(lingkaran.hitungLuas());
        break;
      case 3:
        BangunDatar segitiga = new Segitiga(3, 2);
        System.out.println(segitiga.hitungLuas());
        break;
      default:
        System.out.println("Tidak ada.");
        break;
    }
  }
}
