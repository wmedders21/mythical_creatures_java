package app;

public class Dragon {
    public String name;
    public String color;
    public String rider;
    public int eatCount = 0;

    public Dragon(String name, String color, String rider) {
        this.name = name;
        this.color = color;
        this.rider = rider;
    }

    public Boolean isHungry() {
        if (eatCount < 3) {
        return true;
        } else {
        return false;
        }
    }

    public void eat() {
        eatCount++;
    }
}
