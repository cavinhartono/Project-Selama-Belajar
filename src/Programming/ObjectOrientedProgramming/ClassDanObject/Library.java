package Programming.ObjectOrientedProgramming.ClassDanObject;

public class Library {
  private String name, location, qty;

  public Library(String name, String location, String qty) {
    this.name = name;
    this.location = location;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getQty() {
    return qty;
  }

  public void setQty(String qty) {
    this.qty = qty;
  }

  
}
