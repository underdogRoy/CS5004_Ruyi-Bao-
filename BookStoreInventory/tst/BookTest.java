import java.awt.print.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 test Class for Book
 * <p>
 * Methods shared by Publications are tested in AbstractBookStoreItemTest
 * Methods with unique Book implementations are tested here
 */
public class BookTest {
  private Person pat;
  private Person john;
  private Book book1;
  private Book book2;
  private Book book3;

  /**
   * Set up some examples of Person and Book for testing
   */
  @Before
  public void setUp() {
    // Examples of Person
    pat = new Person("Pat", "Conroy", 1948);
    john = new Person("John", "Steinbeck", 1902);
    // Examples of Book
    book1 = new Book ("Beaches", pat, 2020, 5.0);
    book2 = new Book("Sunsets", pat, 2021, 25.00);
    book3 = new Book("The Grapes of Wrath", john, 1939,  50.00 );
  }
  
  @Test
  public void testBookString() {
    String expected;
    // FlawFound: price expected is not same as price given
    expected = """
        Kind: Book
        Title: Beaches
        Author: Pat Conroy
        Year: 2020
        Price: 5.00""";// FlawFixToDo:change 500 to 5.00
    assertEquals(expected,book1.toString());// FlawFixed:assertEquals pass
  }
}
