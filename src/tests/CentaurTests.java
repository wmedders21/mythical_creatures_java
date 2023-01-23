package tests;

import app.Centaur;
import static org.junit.Assert.*;

import org.junit.Test;

public class CentaurTests {
    @Test
    public void hasAName() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("George", centaur.name);
    }

    @Test
    public void hasABreed() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("Palomino", centaur.breed);
    }

    @Test
    public void hasExcellentBowSkills() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("Twang!!!", centaur.shoot());
    }

    @Test
    public void makesAHorseSoundWhenItRuns() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("Clop clop clop clop", centaur.run());
    }

    @Test
    public void whenFirstCreatedItIsNotCranky() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals(false, centaur.isCranky());
    }

    @Test
    public void whenFirstCreatedItIsStandingUp() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals(true, centaur.isStanding());
    }

    @Test
    public void getsCrankyAfterRunningOrShootingABowThrice() {
        Centaur centaur = new Centaur("George", "Palomino");
        centaur.run();
        centaur.shoot();
        centaur.run();
        assertEquals(true, centaur.isCranky());
    }

    @Test
    public void willNotShootABowWhenCranky() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals(false, centaur.isCranky());

        for (int i = 0; i < 3; i++) {
            centaur.shoot();
        }

        assertEquals("NO!", centaur.shoot());
    }

    @Test 
    public void willNotSleepWhenStanding() {
        Centaur centaur = new Centaur("George", "Palomino");
        assertEquals("NO!", centaur.sleep());
    }

    @Test 
    public void isNotStandingAfterLayingDown() {
        Centaur centaur = new Centaur("George", "Palomino");
        centaur.layDown();
        assertEquals(false, centaur.isStanding());
        assertEquals(true, centaur.isLaying());
    }

    @Test 
    public void canSleepWhenLayingDown() {
        Centaur centaur = new Centaur("George", "Palomino");
        centaur.layDown();
        assertNotEquals("NO!", centaur.sleep());
    }

    @Test 
    public void cannotShootBowWhenLayingDown() {
        Centaur centaur = new Centaur("George", "Palomino");
        centaur.layDown();
        assertEquals("NO!", centaur.shoot());
    }

    @Test 
    public void cannotRunWhenLayingDown() {
        Centaur centaur = new Centaur("George", "Palomino");
        centaur.layDown();
        assertEquals("NO!", centaur.run());
    }

    @Test 
    public void canStandUp() {
        Centaur centaur = new Centaur("George", "Palomino");
        centaur.layDown();
        centaur.standUp();
        assertEquals(true, centaur.isStanding());
    }
    
    @Test 
    public void isNoLongerCrankyAfterSleeping() {
        Centaur centaur = new Centaur("George", "Palomino");
        centaur.shoot();
        centaur.run();
        centaur.shoot();
        assertEquals(true, centaur.isCranky());

        centaur.layDown();
        centaur.sleep();

        assertEquals(false, centaur.isCranky());
    }
}
