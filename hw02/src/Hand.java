import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
/**
 * An interface representing a hand of cards.
 *
 * @param <C> the type of cards in the hand
 */
public interface Hand<C> {
  /**
   * Creates an empty hand.
   *
   * @return an empty hand
   */
  Hand<C> emptyHand();
  /**
   * Adds a card to the hand.
   *
   * @param card the card to be added to the hand
   */
  void add(C card);
  /**
   * Discards the card at the specified index from the hand.
   *
   * @param index the index of the card to be discarded
   */
  void discard(int index);
  /**
   * Retrieves the card at the specified index from the hand.
   *
   * @param index the index of the card to be retrieved
   * @return the card at the specified index
   */
  C get(int index);
  /**
   * Gets the size of the hand.
   *
   * @return the number of cards in the hand
   */
  int getSize();
  /**
   * Checks if the hand is empty.
   *
   * @return true if the hand is empty, false otherwise
   */
  boolean isEmpty();
  /**
   * Finds the index of the specified card in the hand.
   *
   * @param card the card to be searched for in the hand
   * @return the index of the card, or -1 if not found
   */
  int find(C card);
  /**
   * Sorts the cards in the hand using the provided comparator.
   *
   * @param comparator the comparator used to sort the cards
   */
  void sortHand(Comparator<C> comparator);
  /**
   * Retrieves a sub-hand containing only the cards that satisfy the given predicate.
   *
   * @param predicate the predicate to filter the cards
   * @return a sub-hand containing only the cards that satisfy the predicate
   */
  Hand<C> getHand(Predicate<C> predicate);
  /**
   * Calculates the sum of ranks for all the cards in the hand.
   *
   * @return the sum of ranks for all the cards in the hand
   */
  int rankSum();
  /**
   * Converts the cards in the hand to a new type using the provided converter function.
   *
   * @param <R>       the type of the result after conversion
   * @param converter the function to convert cards from type C to type R
   * @return a new hand containing the converted cards
   */
  <R> Hand<R> getMap(Function<C,R> converter);

}
