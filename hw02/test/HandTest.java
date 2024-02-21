import static org.junit.Assert.*;



import java.util.Comparator;
import java.util.function.Predicate;
import org.junit.Test;
/**
 * Tests for hand
 */
public class HandTest {
  Hand<Card> hand=new Handimp().emptyHand();

  @Test
  public void emptyHand() {

    assertTrue(hand.isEmpty());
  }

  @Test
  public void addgetdiscardgetsize() {
    Card card1=new Card(Card.Suit.SPADES,9);
    Card card2=new Card(Card.Suit.SPADES,10);
    hand.add(card1);
    hand.add(card2);
    assertFalse(hand.isEmpty());
    assertEquals(card2, hand.get(0));
    assertEquals(card1,hand.get(1));
    hand.discard(0);
    assertEquals(1,hand.getSize());
    assertEquals(card1,hand.get(0));
  }



  @Test
  public void find() {
    Card card1=new Card(Card.Suit.SPADES,9);
    Card card2=new Card(Card.Suit.SPADES,10);
    Card card3=new Card(Card.Suit.SPADES,11);
    hand.add(card1);
    hand.add(card2);
    assertEquals(1,hand.find(card1));
    assertEquals(0,hand.find(card2));
    assertEquals(-1,hand.find(card3));
  }

  @Test
  public void sortHandbyrank() {
    Card card1=new Card(Card.Suit.SPADES,3);
    Card card2=new Card(Card.Suit.SPADES,2);
    Card card3=new Card(Card.Suit.SPADES,1);
    hand.add(card1);
    hand.add(card2);
    hand.add(card3);
    hand.sortHand(Comparator.comparing(Card::getRank));
    assertEquals(card3,hand.get(0));
    assertEquals(card2,hand.get(1));
    assertEquals(card1,hand.get(2));

  }
  @Test
  public void sortHandbysuits() {
    Card card1=new Card(Card.Suit.SPADES,3);
    Card card2=new Card(Card.Suit.DIAMONDS,4);
    Card card3=new Card(Card.Suit.HEARTS,5);
    Card card4=new Card(Card.Suit.CLUBS,6);
    hand.add(card1);
    hand.add(card2);
    hand.add(card3);
    hand.add(card4);
    hand.sortHand(new SuitComparator());
    assertEquals(card4,hand.get(0));
    assertEquals(card3,hand.get(1));
    assertEquals(card2,hand.get(2));
    assertEquals(card1,hand.get(3));

  }
  @Test
  public void getHand() {
    Card card1=new Card(Card.Suit.SPADES,3);
    Card card2=new Card(Card.Suit.DIAMONDS,4);
    Card card3=new Card(Card.Suit.HEARTS,5);
    Card card4=new Card(Card.Suit.CLUBS,6);
    hand.add(card1);
    hand.add(card2);
    hand.add(card3);
    hand.add(card4);
    Predicate<Card> redSuitPredicate=card -> card.getColor()== Card.Color.RED;
    Hand<Card> redCards= hand.getHand(redSuitPredicate);
    assertEquals(2,redCards.getSize());
    Predicate<Card> rankPredicate=card -> card.getRank()>5;
    Hand<Card> rankCards= hand.getHand(rankPredicate);
    assertEquals(1,rankCards.getSize());


  }

  @Test
  public void rankSum() {
    Card card1=new Card(Card.Suit.SPADES,3);
    Card card2=new Card(Card.Suit.DIAMONDS,4);
    Card card3=new Card(Card.Suit.HEARTS,5);
    hand.add(card1);
    hand.add(card2);
    hand.add(card3);
    assertEquals(12,hand.rankSum());

  }

  @Test
  public void getMap() {
    Card card1=new Card(Card.Suit.SPADES,3);
    Card card2=new Card(Card.Suit.DIAMONDS,4);
    hand.add(card1);
    hand.add(card2);
    Hand<Integer> rankHand=hand.getMap(Card::getRank);
    assertEquals(4,(int)rankHand.get(1));
    Hand<Card.Color> colorHand=hand.getMap(Card::getColor);
    assertEquals(Card.Color.RED,colorHand.get(0));


  }
}