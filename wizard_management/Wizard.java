package wizard_management;
import behaviours.Flyable;
import behaviours.Protector;

public class Wizard {
  String name;
  private Flyable ride;

  public Wizard(String name, Flyable ride){
    this.name = name;
    this.ride = ride;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getFlyable(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

  public String callOnProtector(Protector protector){
    return protector.protect();
  }

  public String mopFloor(Mop mop){
    return "The floor gleams!";
  }

  public String sweepFloor(){
    Broomstick ride = (Broomstick) this.ride;
    return this.name + "'s " + ride.brand + " has carefully rearranged the dust on the floor.";
  }
}