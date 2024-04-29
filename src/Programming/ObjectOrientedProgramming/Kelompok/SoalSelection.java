package Programming.ObjectOrientedProgramming.Kelompok;

public class SoalSelection {
  public void bilanganPrima(int number) {
    boolean prima = true;
    if (number <= 1) {
      prima = false;
    } else {
      for (int i = 2; i <= (number / 2); i++) {
        if(number % i == 0) {
          prima = false;
          break; 
        }
      }
    }
    
    if (prima) {
      System.out.println(number + " adalah bilangan prima");
    } else {
      System.out.println(number + " adalah bukan bilangan prima");
    }
  }

  public void angkaBulan(int number) {
    String result = "";
    switch (number) {
      case 1:
        result = "Januari";
        break;
      case 2:
        result = "Februari";
        break;
      case 3:
        result = "Maret";
        break;
      case 4:
        result = "April";
        break;
      case 5:
        result = "Mei";
        break;
      case 6:
        result = "Juni";
        break;
      case 7:
        result = "Juli";
        break;
      case 8:
        result = "Agustus";
        break;
      case 9:
        result = "September";
        break;
      case 10:
        result = "Oktober";
        break;
      case 11:
        result = "November";
        break;
      case 12:
        result = "Desember";
        break;
    
      default:
        result = "Angka bulan tidak vaild";
        break;
    }

    System.out.println(result);
  }

  public void convert(double calcius) {
    if(calcius < -273.15) {
      System.out.println("Suhu tidak bisa kurang dari -273.15");
    } else {
      System.out.println("Fahrenheit: " + ((calcius * 1.8) + 32));
    }
  }

  public void hurufVokal(String text) {
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      char ch = Character.toLowerCase(text.charAt(i));

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
      }
    }
  
    System.out.println("Jumlah huruf vokal " + count);
  }

  public void deretBintang(int number) {
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      } 
      System.out.println();
    }
  }
}

