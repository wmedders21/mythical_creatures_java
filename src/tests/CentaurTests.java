package tests;

import app.Centaur;
import static org.junit.Assert.*;

import org.junit.Test;

public class CentaurTests {
    @Test
    public void hasAName() {
        Centaur centaur = new Centaur();
        assertEquals("George", centaur.name);
    }
}
