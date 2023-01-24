package app;
import java.util.ArrayList;

public class Direwolf {
    public String name;
    public String home;
    public String size;
    public ArrayList<Stark> starks = new ArrayList<Stark>();

    public Direwolf(String name, String home, String size) {
        this.name = name;
        this.home = home;
        this.size = size;
    }

    public Direwolf(String name, String home) {
        this.name = name;
        this.home = home;
        this.size = "Massive";
    }

    public Direwolf(String name) {
        this.name = name;
        this.home = "Beyond the Wall";
        this.size = "Massive";
    }

    public ArrayList<Stark> starksToProtect() {
        return starks;
    }

    public void protects(Stark stark) {
        if (stark.location == home && starks.size() < 2) {
            stark.setSafe();
            starks.add(stark);
        }
    }

    public Stark leaves(Stark stark) {
        int index = -1;
        for (Stark s : starks) {
            if (s.name == stark.name) {
                index = starks.indexOf(s);
                stark.setUnsafe();
            }
        }
        if (index != -1) {
            starks.remove(index);
        }
        return stark;
    }

    public Boolean canHuntWhiteWalkers() {
        if (starks.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
    }
}