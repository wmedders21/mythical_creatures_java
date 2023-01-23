package app;

public class Centaur {
    public String name;
    public String breed;
    private Boolean mood = false;
    public Centaur(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String shoot() {
        return "Twang!!!";
    }

    public String run() {
        return "Clop clop clop clop";
    }

    public Boolean cranky() {
        return mood;
    }
    public static void main(String[] args) {
    }
}
