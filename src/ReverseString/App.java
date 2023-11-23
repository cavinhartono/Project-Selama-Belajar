package ReverseString;

class ReverseString {
  public void result(String text) {
    String result = "";
    char ch;

    for(int i = 0; i < text.length(); i++) {
      ch = text.charAt(i);
      result = ch + result;
    }

    System.out.println(result);
  }
}

public class App {
  public static void main(String[] args) {
    ReverseString obj = new ReverseString();
    obj.result("Hello, World");
  }
}
