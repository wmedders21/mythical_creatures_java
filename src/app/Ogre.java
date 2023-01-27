package app;

public class Ogre {
    public String name;
    public String home;
    public int swings = 0;

    public Ogre(String name) {
        this.name = name;
        this.home = "Swamp";
    }

    public Ogre(String name, String home) {
        this.name = name;
        this.home = home;
    }

    public void encounter(Human human) {
        human.encounter();
    }

    public void swingAt(Human human) {
        swings ++;
    }

    public static void main(String[] args) {

    }
}
