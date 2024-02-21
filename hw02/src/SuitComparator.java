
import java.util.Comparator;
/**
 * Comparator for comparing cards based on their suit order.
 */
public class SuitComparator implements Comparator<Card> {
  /**
   * Compares two cards based on their suit order.
   *
   * @param card1 the first card to be compared
   * @param card2 the second card to be compared
   * @return a negative integer, zero, or a positive integer if the first card is less than, equal to, or greater than the second card based on suit order
   */

  @Override
  public int compare(Card card1, Card card2) {
    String colororder="CLUBS,HEARTS,DIAMONDS,SPADES";
    int x=colororder.indexOf(card1.getSuit().name());
    int y=colororder.indexOf(card2.getSuit().name());
    if (x<y){
      return -1;
    } else if (x>y) {
      return 1;
    }else{
      return 0;
    }

    }
  }
