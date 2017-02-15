import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import wizard_management.*;
import behaviours.Flyable;

public class WizardTest {

  Wizard wizard;
  Flyable flyable;


  @Before
  public void before(){
    flyable = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", flyable);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
  Broomstick ride = (Broomstick)wizard.getFlyable();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFlyBroomstick(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon() {
    Dragon dragon = new Dragon("Smaug");
    wizard = new Wizard ("Ridcully", dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canFlyMagicCarpet() {
    MagicCarpet persian = new MagicCarpet("red");
    wizard = new Wizard ("Roy Wood", persian);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }

  @Test
  public void canSetRide() {
    Dragon dragon = new Dragon("Erik");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canCallOnDragon(){
    Dragon dragon = new Dragon("Erik");
    Ogre ogre = new Ogre("Brian");
    assertEquals("Beating its massive wings, the dragon immolates its foes with its fiery breath.", wizard.callOnProtector(dragon));
    assertEquals("The ogre smashes his adversaries over the head with its massive ogre fists", wizard.callOnProtector(ogre));
  }
}