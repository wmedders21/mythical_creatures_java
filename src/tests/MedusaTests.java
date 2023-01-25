package tests;
import app.Medusa;
import app.Person;
import static org.junit.Assert.*;
import org.junit.Test;

public class MedusaTests {
    @Test
    public void hasAName() {
        Medusa medusa = new Medusa("Cassiopeia");

        assertEquals("Cassiopeia", medusa.name);
    }

    @Test
    public void hasNoStatuesWhenCreated() {
        Medusa medusa = new Medusa("Cassiopeia");

        assertEquals(true, medusa.statues.isEmpty());
    }

    @Test
    public void gainsAStatueWhenStaringAtAPerson() {
        Medusa medusa = new Medusa("Cassiopeia");
        Person victim = new Person("Perseus");

        medusa.stare(victim);

        assertEquals(1, medusa.statues.size());
        assertEquals("Perseus", medusa.statues.get(0).name);
        assertEquals("class app.Person", medusa.statues.get(0).getClass().toString());
    }

    @Test
    public void turnsAPersonToStoneWhenStaringAtThem() {
        Medusa medusa = new Medusa("Cassiopeia");
        Person victim = new Person("Perseus");

        assertEquals(false, victim.isStoned());

        medusa.stare(victim);

        assertEquals(true, victim.isStoned());
    }

    @Test
    public void canOnlyHaveThreeVictims() {
        Medusa medusa = new Medusa("Cassiopeia");
        Person perseus = new Person("Perseus");
        Person odysseus = new Person("Odysseus");
        Person hector = new Person("Hector");
        Person ajax = new Person("Ajax");

        medusa.stare(perseus);
        medusa.stare(odysseus);
        medusa.stare(hector);
        medusa.stare(ajax);

        assertEquals(3, medusa.statues.size());
    }

    @Test
    public void ifAFourthVictimIsStonedTheFirstIsUnstoned() {
        Medusa medusa = new Medusa("Cassiopeia");
        Person perseus = new Person("Perseus");
        Person odysseus = new Person("Odysseus");
        Person hector = new Person("Hector");
        Person ajax = new Person("Ajax");

        medusa.stare(perseus);

        assertEquals(true, perseus.isStoned());

        medusa.stare(odysseus);
        medusa.stare(hector);
        medusa.stare(ajax);

        assertEquals(false, perseus.isStoned());
    }
}
