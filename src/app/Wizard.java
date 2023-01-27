package app;

public class Wizard {
    public String name;
    public Boolean isBearded;
    public Boolean isRested = true;
    private int spellCount = 0;

    public Wizard(String name) {
        this.name = name;
        this.isBearded = true;
    }

    public Wizard(String name, Boolean isBearded) {
        this.name = name;
        this.isBearded = isBearded;
    }

    public String incantation(String command) {
        return "sudo " + command;
    }

    public String cast() {
        spellCount ++;
        if (spellCount >= 3) {
            isRested = false;
        }
        return "MAGIC MISSILE";
    }

    public static void main(String[] args) {

    }
}
