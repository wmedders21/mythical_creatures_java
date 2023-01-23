package tests;

import app.Direwolf;
import static org.junit.Assert.*;

import org.junit.Test;

public class DirewolfTests {
    @Test
    public void hasAName() {
        Direwolf direwolf = new Direwolf("Nymeria");
        assertEquals("Nymeria", direwolf.name);
    }

    @Test
    public void canHaveADifferentNameAndCanHaveAHome() {
        Direwolf wolf = new Direwolf("Lady");

        assertEquals("Beyond the Wall", wolf.home);
        assertEquals("Lady", wolf.name);
    }
}