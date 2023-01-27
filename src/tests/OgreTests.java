package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

import app.Ogre;

public class OgreTests {
    @Test
    public void hasAName() {
        Ogre ogre = new Ogre("Brak");
        assertEquals("Brak", ogre.name);
    }

    @Test
    public void livesSomewhereByDefault() {
        Ogre ogre = new Ogre("Brak");
        assertEquals("Swamp", ogre.home);
    }

    @Test
    public void doesNotHaveToLiveInASwamp() {
        Ogre ogre = new Ogre("Brak", "Castle");

        assertEquals("Castle", ogre.home);
    }

    @Test
    public void canMeetHumans() {
        Ogre ogre = new Ogre("Brak");
        Human human = new Human();
        assertEquals("Jane", human.name);

        ogre.encounter(human);

        assertEquals(1, human.encounterCounter);
    }

    @Test
    public void isNoticedByEveryThirdHuman() {
        Ogre ogre = new Ogre("Brak");
        Human human = new Human();

        ogre.encounter(human);
        ogre.encounter(human);
        assertEquals(false, human.noticesOgre);

        ogre.encounter(human);
        assertEquals(true, human.noticesOgre());
    }

    @Test
    public void canSwingAClub() {
        Ogre ogre = new Ogre("Brak");
        Human human = new Human();

        ogre.swingAt(human);

        assertEquals(1, ogre.swings);
    }

    @Test
    public void swingsItsClubWhenNoticedByAHuman() {
        Ogre ogre = new Ogre("Brak");
        Human human = new Human();

        ogre.encounter(human);

        assertEquals(0, ogre.swings);

        ogre.encounter(human);
        ogre.encounter(human);

        assertEquals(1, ogre.swings);
        assertEquals(true, human.noticesOgre());
    }

    @Test
    public void hitsHumanEverySecondTimeItSwings() {
        Ogre ogre = new Ogre("Shrek");
        Human human = new Human();

        for (int i = 0; i < 6; i++) {
            ogre.encounter(human);
        }

        assertEquals(6, ogre.encounterCounter);
        assertEquals(2, ogre.swings);
        assertEquals(true, human.isKnockedOut());
    }

    @Test
    public void apologizesAndTheHumanWakesUp() {
        Ogre ogre = new Ogre("Shrek");
        Human human = new Human();

        for (int i = 0; i < 6; i++) {
            ogre.encounter(human);
        }

        assertEquals(true, human.isKnockedOut());

        ogre.apologize(human);

        assertEquals(false, human.isKnockedOut());
    }
}
