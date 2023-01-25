package tests;
import app.Unicorn;
import static org.junit.Assert.*;
import org.junit.Test;

public class UnicornTests {
    @Test
    public void itHasAName() {
        Unicorn unicorn = new Unicorn("Robert");

        assertEquals("Robert", unicorn.name);
    }

    @Test
    public void isSilverByDefault() {
        Unicorn unicorn = new Unicorn("Margaret");

        assertEquals("silver", unicorn.color);
        assertEquals(true, unicorn.isSilver());
    }

    @Test
    public void doesNotHaveToBeSilver() {
        Unicorn unicorn = new Unicorn("Barbara", "purple");

        assertEquals("purple", unicorn.color);
        assertEquals(false, unicorn.isSilver());
    }

    @Test
    public void saysSparklyStuff() {
        Unicorn unicorn = new Unicorn("Johnny");
        assertEquals("**;* Wonderful! **;*", unicorn.say("Wonderful!"));
        assertEquals("**;* I don't like you very much. **;*", unicorn.say("I don't like you very much."));
    }
}
