public class Shoe {
  private String type;
  private String color;
  private String brand;
  private double size;
  public Shoe(String type,String color,String brand, double size){
    this.type=type;
    this.color=color;
    this.brand=brand;
    this.size=size;
  }
  public String getType(){
    return type;
  }
  public String getColor(){
    return color;
  }
  public String getBrand(){
    return brand;
  }
  public double getSize(){
    return size;
  }
  public String toString(){
    return "Shoe " + "type'" + type +
        "', color='" + color  +
        "', brand='" + brand +
        "', size='" + size+"'";
  }

}
