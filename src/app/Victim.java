package app;

public class Victim {
    public String status = "alive";

    public Victim() {
        
    }

    public void changeStatus() {
        if (status == "alive") {
            status = "dead";
        } else {
            status = "alive";
        }
    }
    
    public static void main(String[] args) {

    }
}
