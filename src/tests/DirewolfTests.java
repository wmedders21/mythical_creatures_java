package tests;

import app.Direwolf;
import app.Stark;
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

    @Test
    public void isMassiveByDefault() {
        Direwolf wolf = new Direwolf("Ghost");

        assertEquals("Massive", wolf.size);
        assertEquals("Ghost", wolf.name);
    }

    @Test
    public void canHaveAnotherHomeAndBeAnotherSize() {
        Direwolf wolf = new Direwolf("Shaggydog", "Winterfell", "Smol Pupper");

        assertEquals("Smol Pupper", wolf.size);
        assertEquals("Shaggydog", wolf.name);
        assertEquals("Winterfell", wolf.home);
    }

    @Test
    public void theStarksAreInWinterfellByDefault() {
        Stark stark = new Stark("Bran");
        Direwolf wolf = new Direwolf("Summer", "Winterfell");

        assertEquals("Winterfell", stark.location);
        assertEquals("Winterfell", wolf.home);
    }

    @Test
    public void startsOffWithNoStarksToProtect() {
        Direwolf wolf = new Direwolf("Nymeria");
        // Stark stark = new Stark("Arya");

        assertEquals(0, wolf.starksToProtect().size());
    }

    @Test
    public void protectsTheStarkChildren() {
        Direwolf wolf = new Direwolf("Nymeria", "Riverlands");
        Stark stark = new Stark("Arya", "Riverlands"); 

        wolf.protects(stark);
        
        assertEquals("Arya", wolf.starksToProtect().get(0).name);
    }

    @Test
    public void canOnlyProtectTheStarkChildrenIfTheyAreInTheSameLocation() {
        Direwolf wolf = new Direwolf("Ghost");
        Stark stark = new Stark("Jon", "King's Landing");

        wolf.protects(stark);

        assertEquals(0, wolf.starksToProtect().size());
    }
}