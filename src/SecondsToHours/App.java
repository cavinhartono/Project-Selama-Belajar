package SecondsToHours;

import java.util.Scanner;

class SecondsToHours {
  int days = 0, hours = 0, minutes = 0, seconds = 0;
  String result = "";

  public String toHours(int number) {
    days = number / (24 * 3600);
    hours = number / 3600;
    minutes = number / 60;
    seconds = number % 3600;
    seconds = number % 60;

    return result = hours + " hours " + minutes + " minutes " + seconds + " seconds.";
  }

  public void print() {
    System.out.println(result);
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    SecondsToHours obj = new SecondsToHours();
    obj.toHours(ip.nextInt());
    obj.print();
  }
}