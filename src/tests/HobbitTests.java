package tests;
import app.Hobbit;
import static org.junit.Assert.*;
import org.junit.Test;

public class HobbitTests {
    @Test
    public void hasAName() {
        Hobbit hobbit = new Hobbit("Bilbo");

        assertEquals("Bilbo", hobbit.name);
    }

    @Test
    public void canHaveAnotherName() {
        Hobbit hobbit = new Hobbit("Peregrin");

        assertEquals("Peregrin", hobbit.name);
    }

    @Test
    public void hasAnUnadventurousDisposition() {
        Hobbit hobbit = new Hobbit("Samwise");

        assertEquals("homebody", hobbit.disposition);
     }

    @Test
    public void canHaveADifferentDisposition() {
       Hobbit hobbit = new Hobbit("Frodo", "adventurous");

        assertEquals("adventurous", hobbit.disposition);
     }

    @Test
    public void canGrowOlderWhenCelebratingBirthdays() {
        Hobbit hobbit = new Hobbit("Meriadoc");
        
        assertEquals(0, hobbit.age);

        for (int i = 0; i < 5; i++) {
        hobbit.celebrateBirthday();
        }

        assertEquals(5, hobbit.age);
    }

    @Test
    public void isConsidereredAChildAt32() {
        Hobbit hobbit = new Hobbit("Gerontius");

        for (int i = 0; i < 32; i++) {
            hobbit.celebrateBirthday();
        }

        assertEquals(false, hobbit.isAdult());

        hobbit.celebrateBirthday();

        assertEquals(true, hobbit.isAdult());
    }
}
