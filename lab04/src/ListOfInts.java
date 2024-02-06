import java.util.List;
import java.util.function.Predicate;



/**
 * This interface represents all the operations to be supported by a list of
 * integers
 */
public interface ListOfInts {
  /**
   * Adds an element to the front
   * @param data The integer to be added
   * @return A new list with the element added to the front
   */
  ListOfInts prepend(int data);


  /**
   * Adds an element to the back
   * @param data The integer to be added
   * @return A new list with the element added to the back
   */
  ListOfInts append(int data);

  /**
   * Inserts an element at the specified index.
   * @param data The integer to be inserted
   * @param index The index at which the element should be inserted.
   * @return A new list with the element inserted at the specified index.
   * @throws IndexOutOfBoundsException If the index is out of bounds.
   */
  ListOfInts insertAtIndex(int data,int index) throws IndexOutOfBoundsException;

  /**
   * Gets the data at the specified index.
   * @param index The index of the element to get.
   * @return The integer at the specified index.
   * @throws IndexOutOfBoundsException If the index is out of bounds.
   */
  int getDataAtIndex(int index) throws IndexOutOfBoundsException;

  /**
   * Gets the rest of the list, excluding the first element.
   * @return new list containing all elements except the first
   */
  ListOfInts getRest();

  /**
   * Gets the length of the list.
   * @return The number of elements in the list.
   */
  int getCount();

  /**
   * Gets the sum of all elements in the list.
   * @return The sum of all elements in the list.
   */
  int getSum();


}