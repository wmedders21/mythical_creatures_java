package app;

public class Vampire {
    public String name;
    public String pet;
    public Boolean hasDrunk = false; 

    public Vampire(String name) {
        this.name = name;
        this.pet = "bat";
    }

    public Vampire(String name, String pet) {
        this.name = name;
        this.pet = pet;
    }

    public void drink() {
        hasDrunk = true;
    }

    public Boolean isThirsty() {
        return !hasDrunk;
    }

    public static void main(String[] args) {
    }
}
