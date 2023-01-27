package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import app.Pirate;

public class PirateTests {
    // @Ignore("skip")
    @Test
    public void hasAName() {
        Pirate pirate = new Pirate("Jane");
        assertEquals("Jane", pirate.name);
    }

    @Ignore("skip")
    @Test
    public void canHaveADifferentName() {
        Pirate pirate = new Pirate("Blackbeard");

        assertEquals("Blackbeard", pirate.name);
    }

    @Ignore("skip")
    @Test
    public void isAScallywayByDefault() {
        Pirate pirate = new Pirate("Jane");

        assertEquals("Scallyway", pirate.job);
    }

    @Ignore("skip")
    @Test
    public void isNotAlwaysAScallywag() {
        Pirate pirate = new Pirate("Jack", "cook");

        assertEquals("cook", pirate.job);
    }

    @Ignore("skip")
    @Test
    public void isNotCursedByDefault() {
        Pirate pirate = new Pirate("Jack");

        assertEquals(false, pirate.isCursed);

        pirate.commitHeinousAct;
        assertEquals(false, pirate.isCursed);

        pirate.commitHeinousAct;
        assertEquals(false, pirate.isCursed);

        pirate.commitHeinousAct;
        assertEquals(true, pirate.isCursed);
    }

    @Ignore("skip")
    @Test
    public void startsWithNoBooty() {
        Pirate pirate = new Pirate("Jane");

        assertEquals(0, pirate.booty);
    }

    @Ignore("skip")
    @Test
    public void gets100BootyForRobbingAShip() {
        Pirate pirate = new Pirate("Jane");

        pirate.robShip();
        assertEquals(100, pirate.booty);


        pirate.robShip();
        assertEquals(200, pirate.booty);


        pirate.robShip();
        assertEquals(300, pirate.booty);
    }
}
