package tests;
import static org.junit.Assert.*;
import static org.junit.Test;
import static org.junit.Ignore;
import app.Werewolf;
import app.Victim;

public class WerewolfTests {
    @Ignore("skip")
    @Test
    public void hasAName() {
        Werewolf werewolf = new Werewolf("David");

        assertEquals("David", werewolf.name);
    }

    @Ignore("skip")
    @Test
    public void hasALocation() {
        Werewolf werewolf = new Werewolf("David", "London");

        assertEquals("London", werewolf.location);
    }

    @Ignore("skip")
    @Test
    public void isHumanByDefault() {
        Werewolf werewolf = new Werewolf("David", "London");

        assertEquals(true, werewolf.isHuman);
    }

    @Ignore("skip")
    @Test
    public void whenStartingAsAHumanChangingMakesItTurnIntoAWerewolf() {
        Werewolf werewolf = new Werewolf("David", "London");

        werewolf.change();

        assertEquals(true, werewolf.isWolf);
        assertEquals(false, werewolf.isHuman);
    }

    @Ignore("skip")
    @Test
    public void changingAgainMakesItTurnBackIntoAWerewolf() {
        Werewolf werewolf = new Werewolf("David", "London");

        assertEquals(true, werewolf.isHuman);
        werewolf.change();

        assertEquals(false, werewolf.isWolf);
        werewolf.change();

        assertEquals(true, werewolf.isHuman);
    }

    @Ignore("skip")
    @Test
    public void wehnStartingAsAWerewolfChangingTwiceMakesItAWerewolf() {
        Werewolf werewolf = new Werewolf("David", "London");
        werewolf.change();

        assertEquals(true, werewolf.isWolf);

        werewolf.change();
        werewolf.change();

        assertEquals(true, werewolf.isWolf);
    }

    @Ignore("skip")
    @Test
    public void isNotHungryByDefault() {
        Werewolf werewolf = new Werewolf("David", "London");

        assertEquals(false, werewolf.isHungry);
    }
    
    @Ignore("skip")
    @Test
    public void becomesHungryAfterChangingIntoAWerewolf() {
        Werewolf werewolf = new Werewolf("David", "London");

        werewolf.change();

        assertEquals(true, werewolf.isHungry);
    }

    @Ignore("skip")
    @Test
    public void cannotConsumeAVictimIfInHumanForm() {
        Werewolf werewolf = new Werewolf("David", "London");
        Victim victim = new Victim();
        werewolf.consume(victim);

        assertEquals("alive", victim.status);
    }

    @Ignore("skip")
    @Test
    public void noLongerHungryAfterConsumingAVictim() {
        Werewolf werewolf = new Werewolf("David", "London");
        Victim victim = new Victim();

        werewolf.change();
        werewolf.consume(victim);

        assertEquals(false, werewolf.isHungry);
    }

    @Ignore("skip")
    @Test
    public void consumingVictimMakesVictimDead() {
        Werewolf werewolf = new Werewolf("David", "London");
        Victim victim = new Victim();

        werewolf.change();
        werewolf.consume(victim);

        assertEquals("dead", victim.status);
    }
}
