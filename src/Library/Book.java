package Library;

public class Book {
  private int id;
  private String title, author, year;
  private static int increment = 1;

  public Book(String title, String author, String year) {
    id = increment; 
    this.title = title;
    this.author = author;
    this.year = year;
    increment++;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getYear() {
    return year;
  }

  public boolean isEquals(Book other) {
    String titleFromOther = other.getTitle(), authorFromOther = other.getAuthor();
    boolean isBook = false;

    if(titleFromOther.equals(title) && authorFromOther.equals(author)) {
      isBook = true;
    }

    return isBook;
  }

  @Override
  public String toString() {
    return id + ". " + title + " oleh " + author + ". Tahun " + year;
  }
}
