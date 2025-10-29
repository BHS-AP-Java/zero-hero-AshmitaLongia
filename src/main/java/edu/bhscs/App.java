package edu.bhscs;

public class App {

  public static void main(String[] args) {

    date10_27();

    Player user = new Player();
    String name = user.giveAnswer("What is your name?");
    String age = user.giveAnswer("How old are you?");

    System.out.println("Today's work complete.");
    System.out.println("I am the app.");
  }

  public static void date10_27() {
    Baker bob = new Baker("Bob");

    Table t = new Table(4, 19);
    System.out.println();
    t.setTop("#");
    t.setLegs("|");

    Cake bDay = bob.bakes(5, "Suzzie");

    t.draw();
  }

  public void runApp() {
    System.out.println("Running the app");
  }
}
