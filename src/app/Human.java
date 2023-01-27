package app;

public class Human {
    public String name;
    public int encounterCounter = 0;
    public Boolean isKnockedOut = false;

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

    public void knockOut() {
        isKnockedOut = true;
    }

    public static void main(String[] args) {
        
    }
}
