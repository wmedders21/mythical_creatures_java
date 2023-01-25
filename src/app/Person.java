package app;

public class Person {
    public String name;
    public Boolean status = false;

    public Person(String name) {
        this.name = name;
    }

    public Boolean isStoned() {
        return status;
    }

    public void setStatus(Boolean bool) {
        status = bool;
    }

    public static void main(String[] args) {
    }
}
