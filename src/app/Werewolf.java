package app;

public class Werewolf {
    public String name;
    public String location;
    public Boolean isHuman = true;
    public Boolean isHungry = false;

    public Werewolf(String name) {
        this.name = name;
    }

    public Werewolf(String name) {
        this.name = name;
        this.location = location;
    }

    public void change() {
        if (isHuman) {
            isHungry = true;
            isHuman = false;
        } else {
            isHungry = false;
            isHuman = true;
        }
    }
    public static void main(String[] args) {

    }
}
