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

    public Boolean noticesOgre() {
        if (encounterCounter % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
    }
}
