package app;
import java.util.ArrayList;

public class Medusa {
    public String name;
    public ArrayList<Person> statues = new ArrayList<Person>();

    public Medusa(String name) {
        this.name = name;
    }

    public void stare(Person victim) {
        statues.add(victim);
        victim.setStatus(true);
        if (statues.size() > 3) {
            statues.get(0).setStatus(false);
            statues.remove(0);
        } 
    }

}
