package tests;
import app.Vampire;
import static org.junit.Assert.*;
import org.junit.Test;

public class VampireTests {
    @Test
    public void hasAName() {
        Vampire dracula = new Vampire("Dracula");

        assertEquals("Dracula", dracula.name);
    }

    @Test
    public void canBeNamedSomethingElse() {
        Vampire vlad = new Vampire("Vladimir");

        assertEquals("Vladimir", vlad.name);
    }

    @Test
    public void keepsAPetBatByDefault() {
        Vampire ruthven = new Vampire("Ruthven");

        assertEquals("bat", ruthven.pet);
    }

    @Test
    public void canKeepOtherPets() {
        Vampire varney = new Vampire("Varney", "fox");

        assertEquals("fox", varney.pet);
    }

    @Test
    public void isThirstyByDefault() {
        Vampire count = new Vampire("The Count");

        assertEquals(true, count.isThirsty());
    }

    @Test
    public void isNotThirstyAfterDrinking() {
        Vampire liz = new Vampire("Elizabeth Bathory");

        liz.drink();

        assertEquals(false, liz.isThirsty());
    }
}
