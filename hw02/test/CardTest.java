import static org.junit.Assert.*;
/**
 * Tests for card
 */



public class CardTest {
  Card card1 = new Card(Card.Suit.HEARTS, 4);
  Card card2 = new Card(Card.Suit.DIAMONDS, 13);

  @org.junit.Test
  public void getTest() {

    assertEquals(Card.Suit.HEARTS,card1.getSuit());
    assertEquals(Card.Suit.DIAMONDS,card2.getSuit());
    assertEquals(4,card1.getRank());
    assertEquals(13,card2.getRank());
    assertEquals(Card.Color.RED,card1.getColor());
    assertEquals(Card.Color.BLACK,card2.getColor());
  }


  @org.junit.Test
  public void testToString() {
    assertEquals("Card{suit=HEARTS, rank=4}",card1.toString());
    assertEquals("Card{suit=DIAMONDS, rank=13}",card2.toString());
  }

  @org.junit.Test
  public void testHashCode() {
    Card card1 = new Card(Card.Suit.CLUBS, 12);
    Card card2 = new Card(Card.Suit.CLUBS, 12);
    Card card3 = new Card(Card.Suit.CLUBS, 11);

    assertEquals(card1.hashCode(), card2.hashCode());
    assertNotEquals(card1.hashCode(),card3.hashCode());
  }

  @org.junit.Test
  public void testEquals() {
    Card card1 = new Card(Card.Suit.SPADES, 1);
    Card card2 = new Card(Card.Suit.SPADES, 1);
    Card card3 = new Card(Card.Suit.HEARTS, 2);

    assertTrue(card1.equals(card2));
    assertFalse(card1.equals(card3));
  }

  @org.junit.Test
  public void compareTo() {
    Card card1 = new Card(Card.Suit.SPADES, 1);
    Card card2 = new Card(Card.Suit.SPADES, 1);
    Card card3 = new Card(Card.Suit.HEARTS, 2);
    assertTrue(card2.compareTo(card1) == 0);
    assertTrue(card1.compareTo(card3)<0);

  }
}