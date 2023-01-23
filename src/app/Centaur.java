package app;

public class Centaur {
    public String name;
    public String breed;
    private Boolean cranky = false;
    private Boolean standing = true;
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

    public Boolean isCranky() {
        return cranky;
    }

    public Boolean isStanding() {
        return standing;
    }
    public static void main(String[] args) {
    }
}
