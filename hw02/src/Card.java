import java.util.Comparator;
import java.util.Objects;
/**
 * Class representing a playing card.
 */
public class Card implements Comparable<Card>{
  /**
   * Enum representing the suits of cards.
   */
  public enum Suit{CLUBS,DIAMONDS,HEARTS,SPADES}
  /**
   * Enum representing the colors of cards.
   */
  public enum Color{RED,BLACK}
  private Suit suit;
  private int rank;
  /**
   * Constructs a Card with the given suit and rank.
   *
   * @param suit the suit of the card
   * @param rank the rank of the card
   * @throws IllegalArgumentException if the rank is out of range
   */
  public Card(Suit suit,int rank){
    if(rank<1||rank>13){
      throw new IllegalArgumentException("Rank must be between 1 and 13");
    }
    this.suit=suit;
    this.rank=rank;
  }
  /**
   * Gets the suit of the card.
   *
   * @return the suit of the card
   */
  public Suit getSuit() {
    return suit;
  }
  /**
   * Gets the rank of the card.
   *
   * @return the rank of the card
   */
  public int getRank() {
    return rank;
  }
  /**
   * Gets the color of the card.
   *
   * @return Enum RED or BLACK depending on the suit
   */
  public Color getColor(){
    if (suit==Suit.CLUBS||suit==Suit.DIAMONDS){
      return Color.BLACK;
    }else{
      return Color.RED;
    }
  }
  /**
   * Returns a string representation of the card.
   *
   * @return a string representation of the card
   */
  @Override
  public String toString() {
    return "Card{" +
        "suit=" + suit +
        ", rank=" + rank +
        '}';
  }
  /**
   * Returns the hash code for the card.
   *
   * @return the hash code for the card
   */
  @Override
  public int hashCode(){
    return Objects.hash(suit,rank);
  }
  /**
   * Indicates whether the other card is "equal to" this card.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Card)) {
      return false;
    }
    Card other = (Card) o;
    return (this.rank==other.getRank())
        && (this.suit == other.getSuit());
  }
  /**
   * Compares this card to another card based on their ranks.
   *
   * @param other the card to be compared
   * @return a negative integer, zero, or a positive integer as this card is less than, equal to, or greater than the specified card
   */
  @Override
  public int compareTo(Card other){
    return Integer.compare(this.rank,other.rank);
  }
}
