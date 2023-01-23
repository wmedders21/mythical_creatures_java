package app;

public class Centaur {
    public String name;
    public String breed;
    private Boolean cranky = false;
    private Boolean standing = true;
    private int runAndShootCount = 0;
    public Centaur(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String shoot() {
        if (runAndShootCount >= 3 || !standing) {
            return "NO!";
        } else {
            runAndShootCount++;
            return "Twang!!!";
        }
    }

    public String run() {
        if (standing) {
            runAndShootCount++;
            return "Clop clop clop clop";
        } else {
            return "NO!";
        }
    }

    public Boolean isCranky() {
        if (runAndShootCount > 2) {
            cranky = true;
        }
        return cranky;
    }

    public Boolean isStanding() {
        return standing;
    }

    public String sleep() {
        if (standing) {
            return "NO!";
        } else {
            return "OK";
        }
    }

    public Boolean isLaying() {
        return !standing;
    }

    public void layDown() {
        standing = false;
    }

    public void standUp() {
        standing = true;
    }
    public static void main(String[] args) {
    }
}
