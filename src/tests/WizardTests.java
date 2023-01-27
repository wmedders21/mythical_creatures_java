package tests;
import app.Wizard;
import static org.junit.Assert.*;
import org.junit.Test;
// import org.junit.Ignore;

public class WizardTests {
    @Test
    public void hasAName() {
        Wizard wizard= new Wizard("Eric");

        assertEquals("Eric", wizard.name);
    }

    // @Ignore("Skipping")
    @Test
    public void hasADifferentName() {
        Wizard wizard = new Wizard("Alex");

        assertEquals("Alex", wizard.name);
    }

    // @Ignore("Skipping")
    @Test
    public void isBeardedByDefault() {
        Wizard wizard = new Wizard("Ben");

        assertEquals(true, wizard.isBearded);
    }

    // @Ignore("Skipping")
    @Test
    public void isNotAlwaysBearded() {
        Wizard wizard = new Wizard("Stella", false);

        assertEquals(false, wizard.isBearded);
    }

    // @Ignore("skipping")
    @Test
    public void hasRootPowers() {
        Wizard wizard = new Wizard("Stella", false);

        assertEquals("sudo chown ~/bin", wizard.incantation("chown ~/bin"));
    }

    // @Ignore("skipping")
    @Test
    public void hasManyRootPowers() {
        Wizard wizard = new Wizard("Sal", true);

        assertEquals("sudo rm -rf /home/mirandax", wizard.incantation("rm -rf /home/mirandax"));
    }

    // @Ignore("skipping")
    @Test
    public void startsRested() {
        Wizard wizard = new Wizard("Bob");

        assertEquals(true, wizard.isRested);
    }

    // @Ignore("Skipping")
    @Test
    public void canCastSpells() {
        Wizard wizard = new Wizard("Bob");

        assertEquals("MAGIC MISSILE", wizard.cast());
    }

    // @Ignore("skipping")
    @Test
    public void getsTiredAfterCastingThreeSpells() {
        Wizard malfoy = new Wizard("Malfoy");

        malfoy.cast();
        malfoy.cast();

        assertEquals(true, malfoy.isRested);

        malfoy.cast();
        
        assertEquals(false, malfoy.isRested);
    }
}