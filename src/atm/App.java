import java.util.Scanner;

class ATM {
    float balance, amount;
    int pin = 2004;

    private static Scanner ip = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Cek Rekening");
        System.out.println("2. Deposit");
        System.out.println("3. Tarik Tunai");
        System.out.println("4. Keluar");

        System.out.print("Masukan pilihan Anda: ");
        int option = ip.nextInt();

        if (option == 1) balance();
        else if (option == 2) deposit();
        else if (option == 3) withdraw();
        else if (option == 4) return;
        else {
            System.err.println("Masukan pilihan Anda yang benar!");
            menu();
        };
    }

    public void checkPin() {
        System.out.print("Masukan PIN: ");

        int enteredPin = ip.nextInt();

        if (enteredPin == pin) menu();
        else System.err.println("PIN Anda salah");
    }

    public void balance() {
        System.out.println("Total Tunai Rp. " + balance);
        menu();
    }

    public void withdraw() {
        System.out.print("Masukan jumlah rupiah: Rp. ");
        amount = ip.nextFloat();

        if (amount > balance) {
            System.err.println("Maaf, jumlah rupiah Anda kurang");
            menu();
        } else {
            balance -= amount;
            System.out.println("Tarik tunai sukses!");
            menu();
        }
    }

    public void deposit() {
        System.out.print("Masukan jumlah rupiah: ");
        amount = ip.nextFloat();
        
        balance += amount;

        System.out.println("Deposit sukses!");
        menu();
    }
}

public class App {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
