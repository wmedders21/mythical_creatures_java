package app;

public class Human {
    public String name;
    public int encounterCounter = 0;

    public Human() {
        this.name = "Jane";
    }

    public void encounter() {
        encounterCounter ++;
    }
}
