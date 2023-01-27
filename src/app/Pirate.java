package app;

public class Pirate {
    public String name;
    public String job;
    public Boolean isCursed = false;
    public int heinousActCounter = 0;
    public int booty = 0;

    public Pirate(String name) {
        this.name = name;
        this.job = "Scallywag";
    }

    public Pirate(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public void commitHeinousAct() {
        heinousActCounter ++;
        if (heinousActCounter >= 3) {
            isCursed = true;
        }
    }
}
