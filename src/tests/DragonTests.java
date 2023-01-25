package tests;
import app.Dragon;
import static org.junit.Assert.*;
import org.junit.Test;
// import org.junit.Ignore;

public class DragonTests {
    @Test
    public void hasAName() {
        Dragon dragon = new Dragon("Ramoth", "gold", "Lessa");

        assertEquals("Ramoth", dragon.name);
    }

    @Test
    public void hasAColor() {
        Dragon dragon = new Dragon("Ramoth", "gold", "Lessa");

        assertEquals("gold", dragon.color);
    }

    @Test
    public void isADifferentDragon() {
        Dragon dragon = new Dragon("Mnementh", "bronze", "Flar");

        assertEquals("Mnementh", dragon.name);
    }

    @Test
    public void hasADifferentColor() {
        Dragon dragon = new Dragon("Mnementh", "bronze", "Flar");

        assertEquals("bronze", dragon.color);
    }

    @Test
    public void hasADifferentRider() {
        Dragon dragon = new Dragon("Mnementh", "bronze", "Flar");

        assertEquals("Flar", dragon.rider);
    }

    @Test
    public void wasBornHungry() {
        Dragon dragon = new Dragon("Billy", "red", "Sam");

        assertEquals(true, dragon.isHungry());
    }

    @Test
    public void eatsALot() {
        Dragon dragon = new Dragon("Puff", "green", "Sinbad");

        assertEquals(true, dragon.isHungry());
        dragon.eat();
        assertEquals(true, dragon.isHungry());
        dragon.eat();
        assertEquals(true, dragon.isHungry());
        dragon.eat();
        assertEquals(false, dragon.isHungry());
    }
}
