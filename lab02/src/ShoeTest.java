public class ShoeTest {
  public static void main(String[] args){
    Shoe shoe1=new Shoe("tennis","Black","Nike",7.5);
    System.out.println("Type: " + shoe1.getType());
    System.out.println("Color: " + shoe1.getColor());
    System.out.println("Brand: " + shoe1.getBrand());
    System.out.println("Size: " + shoe1.getSize());
    System.out.println(shoe1);
  }

}
