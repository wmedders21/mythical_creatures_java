package app;

public class Werewolf {
    public String name;
    public String location;
    public Boolean isHuman = true;
    public Boolean isHungry = false;
    public Boolean isWolf = false;

    public Werewolf(String name) {
        this.name = name;
    }

    public Werewolf(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void change() {
        if (isHuman) {
            isHungry = true;
            isHuman = false;
            isWolf = true;
        } else {
            isHungry = false;
            isHuman = true;
            isWolf = false;
        }
    }

    public void consume(Victim victim) {
        if (isWolf) {
            isHungry = false;
            victim.changeStatus();
        }
    }
    public static void main(String[] args) {

    }
}
