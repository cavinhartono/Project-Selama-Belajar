package Programming.ObjectOrientedProgramming.Selection;

public class ContohSoal {
  public String satu(int number) {
    return number % 2 == 0 ? "Genap" : "Ganjil";
  }

  public String duaIfStatement(int number) {
    if (number > 0) {
      return "Angka tersebut bilangan positif";
    } else if (number < 0) {
      return "Angka tersebut bilangan negatif";
    } else {
      return "Angka tersebut bilangan nol";
    }
  }

  public void duaSwitchCase(char choice) {
    switch (choice) {
      case 'A':
        System.out.println("Anda memilih pilihan A");
        break;
      case 'B':
        System.out.println("Anda memilih pilihan B");
        break;
      case 'C':
        System.out.println("Anda memilih pilihan C");
        break;
      default:
        System.out.println("Pilihan tidak valid..");
        break;
    }
  }

  public String tiga(int age, String lisence) {
    if (age >= 18 && lisence.equalsIgnoreCase("ya")) {
      return "Anda dapat mengemudikan mobil";
    } else if (age >= 16 && lisence.equalsIgnoreCase("ya")) {
      return "Anda dapat mengemudikan motor";
    } else {
      return "Anda tidak dapat mengemudikan kendaraan";
    }
  }

  public void empat(int score) {
    char result;

    if (score >= 0 && score < 100) {
      if(score >= 90) {
        result = 'A';
      } else if(score >= 80) {
        result = 'B';
      } else if (score >= 70) {
        result = 'C';
      } else if (score >= 60) {
        result = 'D';
      } else {
        result = 'E';
      }

      switch (result) {
        case 'A':
          System.out.println("Pertahankan prestasimu!");
          break;
        case 'B':
          System.out.println("Bisa lebih baik lagi!");
          break;
        case 'C':
          System.out.println("Perlu lebih banyak belajar.");
          break;
        case 'D':
          System.out.println("Perlu meningkatkan usaha.");
          break;
        case 'E':
          System.out.println("Belajar lebih giat lagi!");
          break;
        default:
          System.out.println("Keterangan tidak valid.");
          break;
      }
    } else {
      System.out.println("Nilai tidak valid..");
    }
  }

  public char lima(int score) {
    if (score >= 90) {
      return 'A';
    } else if (score >= 70) {
      return 'B';
    } else if (score >= 60) {
      return 'C';
    } else if (score >= 50) {
      return 'D';
    } else {
      return 'E';
    }
  }

  public void enam(int number) {
    String result = (number > 0) 
                      ? "Bilangan positif" 
                      : (number < 0) 
                        ? "Bilangan negatif" 
                        : "Nol";

    System.out.println("Angka yang dimasukan adalah " + result);

    int x = 5, y = 3;

    int sum = x + y, min = x - y, multiple = x * y;
    double divide = (y != 0) 
                      ? ((double) x / y) 
                      : 0;

    System.out.println("Hasil penjumlahan: " + sum);
    System.out.println("Hasil pengurangan: " + min);
    System.out.println("Hasil perkalian  : " + multiple);
    System.out.println("Hasil pembagian  : " + divide);
  }

  public String enamSwitchCaseDenganTernary(char choice) {
    return (choice == 'A')
            ? "Anda memilih pilihan A"
            : (choice == 'B')
              ? "Anda memilih pilihan B"
              : (choice == 'C')
                ? "Anda memilih pilihan C"
                : "Pilihan Anda tidak valid.";
  }
}