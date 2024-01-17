/**
 * This class represents a shoe. A shoe has a type, a color, a brand and a size
 */
public class Shoe {
  private String type;
  private String color;
  private String brand;
  private double size;
  /**
   * Construct a Shoe object that has the provided type, color, brand and size
   *
   * @param type the type to be given to this shoe
   * @param color the color to be given to this shoe
   * @param brand the brand to be assigned to this shoe
   * @param size the size to be assigned to this shoe
   */
  public Shoe(String type,String color,String brand, double size){
    this.type=type;
    this.color=color;
    this.brand=brand;
    this.size=size;
  }
  /**
   * Return the type of this shoe
   *
   * @return the type of this shoe
   */
  public String getType(){
    return type;
  }
  /**
   * Return the color of this shoe
   *
   * @return the color of this shoe
   */
  public String getColor(){
    return color;
  }
  /**
   * Return the brand of this shoe
   *
   * @return the brand of this shoe
   */
  public String getBrand(){
    return brand;
  }
  /**
   * Return the size of this shoe
   *
   * @return the size of this shoe
   */
  public double getSize(){
    return size;
  }
  /**
   * String method to summarize the object
   *
   * @return the string of the object
   */
  public String toString(){
    return "Shoe " + "type'" + type +
        "', color='" + color  +
        "', brand='" + brand +
        "', size='" + size+"'";
  }

}
