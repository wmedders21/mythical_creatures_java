package app;

public class Stark {
    public String name;
    public String location;
    public Boolean safe = false;

    public Stark(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    public Stark(String name) {
        this.name = name;
        this.location = "Winterfell";
    }

    public Boolean isSafe() {
        return safe;
    }

    public void setSafe() {
        safe = true;
    }

    public void setUnsafe() {
        safe = false;
    }

    public static void main(String[] args) {

    }
}