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

        assertEquals(true, wolf.starksToProtect().isEmpty());
    }

    @Test
    public void canOnlyProtectTwoStarksAtATime() {
        Direwolf summerwolf = new Direwolf("Summer", "Winterfell");
        Direwolf ladywolf = new Direwolf("Lady", "Winterfell");
        Stark sansaStark = new Stark("Sansa");
        Stark jonStark = new Stark("Jon");
        Stark robStark = new Stark("Rob");
        Stark branStark = new Stark("Bran");
        Stark aryaStark = new Stark("Arya");

        summerwolf.protects(sansaStark);
        summerwolf.protects(jonStark);
        ladywolf.protects(robStark);
        ladywolf.protects(branStark);
        ladywolf.protects(aryaStark);

        assertEquals(true, summerwolf.starksToProtect().contains(sansaStark));
        assertEquals(true, summerwolf.starksToProtect().contains(jonStark));
        assertEquals(true, ladywolf.starksToProtect().contains(robStark));
        assertEquals(true, ladywolf.starksToProtect().contains(branStark));
        assertEquals(false, ladywolf.starksToProtect().contains(aryaStark));
    }

    @Test
    public void starksAreUnsafeByDefault() {
        Stark stark = new Stark("Jon", "The Wall");

        assertEquals(false, stark.isSafe());
    }

    @Test
    public void protectsTheStarks() {
        Direwolf wolf = new Direwolf("Nymeria", "Winterfell");
        Stark aryaStark = new Stark("Arya");
        Stark sansaStark = new Stark("Sansa");

        wolf.protects(aryaStark);

        assertEquals(true, aryaStark.isSafe());
        assertEquals(false, sansaStark.isSafe());
    }

    @Test
    public void huntsWhiteWalkers() {
        Direwolf wolf = new Direwolf("Nymeria", "Winterfell");

        assertEquals(true, wolf.canHuntWhiteWalkers());
    }

    @Test
    public void willNotHuntWhiteWalkersWhenProtectingStarks() {
        Direwolf wolf = new Direwolf("Nymeria", "Winterfell");
        Stark arya = new Stark("Arya");

        wolf.protects(arya);

        assertEquals(false, wolf.canHuntWhiteWalkers());
    }

    @Test
    public void canLeaveAndStopProtectingStarks() {
        Direwolf summerwolf = new Direwolf("Summer", "Winterfell");
        Direwolf ladywolf = new Direwolf("Lady", "Winterfell");
        Stark sansa = new Stark("Sansa");
        Stark arya = new Stark("Arya");

        summerwolf.protects(arya);
        ladywolf.protects(sansa);
        summerwolf.leaves(arya);

        assertEquals(true, summerwolf.starksToProtect().isEmpty());
        assertEquals("Sansa", ladywolf.starksToProtect().get(0).name);
        assertEquals(false, arya.isSafe());
    }

    @Test
    public void leaveMethodReturnsTheStarkObject() {
        Direwolf summerwolf = new Direwolf("Summer", "Winterfell");
        Direwolf ladywolf = new Direwolf("Lady", "Winterfell");
        Stark sansa = new Stark("Sansa");
        Stark arya = new Stark("Arya");  
        Stark rickon = new Stark("Rickon");

        summerwolf.protects(arya);
        ladywolf.protects(sansa);
        summerwolf.leaves(arya);

        Stark expected = ladywolf.leaves(rickon);

        assertEquals("Rickon", expected.name);
    }
}
