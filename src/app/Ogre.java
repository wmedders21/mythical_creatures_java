package app;

public class Ogre {
    public String name;
    public String home;
    public int swings = 0;
    public int encounterCounter = 0;

    public Ogre(String name) {
        this.name = name;
        this.home = "Swamp";
    }

    public Ogre(String name, String home) {
        this.name = name;
        this.home = home;
    }

    public void encounter(Human human) {
        encounterCounter ++;
        if (encounterCounter % 3 == 0) {
            swingAt(human);
        }
        human.encounter();
    }

    public void swingAt(Human human) {
        swings ++;
        if (swings % 2 == 0) {
            human.knockOut();
        }
    }

    public static void main(String[] args) {

    }
}
