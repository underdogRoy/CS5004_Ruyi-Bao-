public class PetRock {
  private String name;
  private boolean happy=false;
  private double mass;

  public PetRock(String name,double mass) {
    if (name.isEmpty()){
      throw new IllegalArgumentException();
    }
    this.name = name;
    this.mass = mass;
  }
  public String getName() {
    return name;
  }
  public boolean isHappy(){
    return happy;
  }

  public double getMass() {
    return mass;
  }

  public void PlayWithRock() {
    happy=true;
  }
  public String getHappyMessage(){
    if (!happy){
      throw new IllegalStateException();
    }
    return "I'm happy!";
  }
  public int getFavNumber(){
    return 7;
  }
  public void waitTillHappy(){
    while (!happy) {
    }
  }

  @Override
  public String toString() {
    return "PetRock{name="+name+",happy="+happy+",mass="+mass+"}";
  }
}