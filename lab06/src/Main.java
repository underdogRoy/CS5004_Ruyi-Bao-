import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Book {
  private String title;
  private int yearPublished;
  private float price;

  public Book(String title, int yearPublished, float price) {
    this.title = title;
    this.yearPublished = yearPublished;
    this.price = price;
  }

  public float getPrice() {
    return price;
  }

  public int getYearPublished() {
    return yearPublished;
  }
}

public class Main {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Book 1", 2018, 20.0f));
    books.add(new Book("Book 2", 2020, 21.0f));
    books.add(new Book("Book 3", 2022, 22.0f));
    books.add(new Book("Book 4", 2024, 23.0f));


    int yearThreshold = 2021; // Define the threshold year here

    List<Float> prices = books.stream()
        .filter(book -> book.getYearPublished() < yearThreshold)
        .map(Book::getPrice)
        .collect(Collectors.toList());

    System.out.println("Prices of books published before " + yearThreshold + ": " + prices);
  }
}
