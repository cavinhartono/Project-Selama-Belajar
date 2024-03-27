package Programming.ObjectOrientedProgramming.ClassDanObject;

public class Staff {
  private String nip, name, job;

  public Staff(String nip, String name, String job) {
    this.nip = nip;
    this.name = name;
    this.job = job;
  }

  public String getNip() {
    return this.nip;
  }

  public String getName() {
    return this.name;
  }

  public String getStudy() {
    return this.job;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStudy(String job) {
    this.job = job;
  }

  public void info() {
    System.out.println("NIP   : " + nip);
    System.out.println("Nama  : " + name);
    System.out.println("Prodi : " + job);
  }
}
