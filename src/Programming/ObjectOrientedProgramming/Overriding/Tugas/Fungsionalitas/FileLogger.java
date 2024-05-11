package Programming.ObjectOrientedProgramming.Overriding.Tugas.Fungsionalitas;

public class FileLogger extends Logger {
  @Override
  public void log(String message) {
    System.out.println("Writting to file: " + message);
  }
}
