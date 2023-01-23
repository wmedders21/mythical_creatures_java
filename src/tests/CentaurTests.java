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
}
