package app;

public class Hobbit {
    public String name;
    public String disposition;
    public int age = 0;

    public Hobbit(String name) {
        this.name = name;
        this.disposition = "homebody";
        // this.age = age;
    }

    public Hobbit(String name, String disposition) {
        this.name = name;
        this.disposition = disposition;
        // this.age = age;
    }

    public void celebrateBirthday() {
        age++;
    }

    public Boolean isAdult() {
        if (age < 33) {
            return false;
        } else {
            return true;
        }
    }


  
}
