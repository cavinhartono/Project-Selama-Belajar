package GetFinalExam;

import java.io.*;
import java.util.*;

class App {
  private static Scanner ip = new Scanner(System.in);
  private static HashMap<String, Student> Students = new HashMap<>();

  public static void main(String[] args) {
    int choice;
    String[] Menus = { "Tambah Mahasiswa", "Submit dan Simpan ke CSV", "Import dari CSV", "Keluar" };

    do {
      viewStudent();
      printMenu(Menus);
      System.out.print("Pilihan: ");
      choice = ip.nextInt();
      ip.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Halaman Tambah Mahasiswa");
          addStudent();
          break;
        case 2:
          System.out.println("Tunggu sebentar...");
          exportFile("input", new ArrayList<>(Students.values()), "src\\GetFinalExam\\temp_mahasiswa.csv");
          result();
          Students.clear();
          break;
        case 3:
          System.out.println("Proses import file...");
          System.out.print("Masukan nama file (.csv): ");
          importFile("src\\GetFinalExam\\" + ip.nextLine());
          break;
        case 4:
          System.out.println("Program keluar.\n");
          break;
        default:
          System.err.println("Pilihan tidak tersedia.\n");
          break;
      }
    } while (choice != Menus.length);
  }

  public static void printMenu(String[] Menus) {
    int number = 1;
    for (String menu : Menus) {
      System.out.println("Tekan " + number + ": " + menu);
      number++;
    }
  }

  public static void addStudent() {
    System.out.print("Masukan NIM             : ");
    String nim = ip.nextLine();

    if (Students.containsKey(nim)) {
      System.out.println("NIM sudah ada dan coba lagi...");
      return;
    }

    System.out.print("Masukan Nama Mahasiswa  : ");
    String name = ip.nextLine();
    System.out.print("Masukan Nilai Absensi   : ");
    double attendence = ip.nextDouble();
    System.out.print("Masukan Nilai Tugas     : ");
    double project = ip.nextDouble();
    System.out.print("Masukan Nilai Kuis      : ");
    double quiz = ip.nextDouble();
    System.out.print("Masukan Nilai UTS       : ");
    double halfTerm = ip.nextDouble();
    System.out.print("Masukan Nilai UAS       : ");
    double finalTerm = ip.nextDouble();

    Student student = new Student(nim, name, attendence, project, quiz, halfTerm, finalTerm);
    Students.put(nim, student);

    exportFile("input", new ArrayList<>(Students.values()), "src\\GetFinalExam\\mahasiswa.csv");

    System.out.println("Data Mahasiswa berhasil ditambah!");
  }

  public static void viewStudent() {
    if (!Students.isEmpty()) {
      ArrayList<Student> ListOfStudents = new ArrayList<>(Students.values());

      sort(ListOfStudents);

      System.out.println("\n+--------+--------------------------------+---------+-------+------+-----+-----+");
      System.out.println("| NIM    | Nama                           | Absensi | Tugas | Kuis | UTS | UAS |");
      System.out.println("+--------+--------------------------------+---------+-------+------+-----+-----+");
      for (Student student : ListOfStudents) {
        System.out.println(student.toInputString());
      }
      System.out.println("+--------+--------------------------------+---------+-------+------+-----+-----+\n");
    } else {
      System.out.println("Data Mahasiswa kosong.");
      return;
    }
  }

  public static void sort(ArrayList<Student> ListOfStudents) {
    for (int i = 1; i < ListOfStudents.size(); i++) {
      Student key = ListOfStudents.get(i);
      int j = i - 1;
      while (j >= 0 && ListOfStudents.get(j).nim.compareTo(key.nim) > 0) {
        ListOfStudents.set(j + 1, ListOfStudents.get(j));
        j--;
      }
      ListOfStudents.set(j + 1, key);
    }
  }

  public static void result() {
    ArrayList<Student> ListOfStudents = new ArrayList<>(Students.values());

    sort(ListOfStudents);

    System.out.println(
        "\n+----+--------------------------------+-----------------------+-------------+-------+---------------+");
    System.out.println(
        "| No | Nama                           | Prodi                 | Nilai Akhir | Grade | Keterangan    |");
    System.out.println(
        "+----+--------------------------------+-----------------------+-------------+-------+---------------+");
    int no = 1;
    for (Student student : ListOfStudents) {
      student.getFinalResult();
      System.out.println(student.toProsesString(no++));
    }
    System.out.println(
        "+----+--------------------------------+-----------------------+-------------+-------+---------------+");

    exportFile("output", ListOfStudents, "src\\GetFinalExam\\data_mahasiswa.csv");
  }

  public static void importFile(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String text;
      br.readLine();

      while ((text = br.readLine()) != null) {
        String[] Data = text.split(",");

        String nim = Data[0];
        String name = Data[1];
        double attendance = Double.parseDouble(Data[2]);
        double project = Double.parseDouble(Data[3]);
        double quiz = Double.parseDouble(Data[4]);
        double halfTerm = Double.parseDouble(Data[5]);
        double finalTerm = Double.parseDouble(Data[6]);

        Student student = new Student(nim, name, attendance, project, quiz, halfTerm, finalTerm);
        Students.put(nim, student);
        System.out.println("Import File berhasil!");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void exportFile(String type, ArrayList<Student> ListOfStudents, String fileName) {
    if (!ListOfStudents.isEmpty()) {
      try (FileWriter fw = new FileWriter(fileName)) {
        switch (type) {
          case "input":
            fw.write("NIM,Nama,Absensi,Tugas,Kuis,UTS,UAS\n");
            for (Student student : ListOfStudents) {
              fw.write(student.toCSVInput() + "\n");
            }
            break;
          case "output":
            fw.write("NIM,Nama,Prodi,Nilai Akhir,Grade,Keterangan\n");
            for (Student student : ListOfStudents) {
              fw.write(student.toCSVProses() + "\n");
            }
            break;
          default:
            System.err.println("Tidak dapat diexport.");
            break;
        }

        System.out.println("Data berhasil diexport!");
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("Tidak ada data yang diexport.");
    }
  }
}