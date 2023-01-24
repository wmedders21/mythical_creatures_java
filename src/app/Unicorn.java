package app;

public class Unicorn {
  public String name;
  public String color;
   
  public Unicorn(String name) {
    this.name = name;
    this.color = "silver";
  }

  public Unicorn(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String say(String string) {
    return "**;* " + string + " **;*";
  }

  public Boolean isSilver() {
    if (color == "silver") {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {

  }
}
