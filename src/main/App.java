package edu.bhscs;

public class App {
  public static void main(String[] args) {

    date_10_21();
    Player user = new Player("jufvivik P. Player");

    String name = user.giveAnswer("What is your name?");
    String age = user.giveAnswer("How old are you?");

    new Cake().draw(name, age);

    System.out.println("toudays wwork");

    System.out.println("I am the app");
  }

  public static void date10_27() {
    Baker bob = new Baker("Bob");
    Table t = new Table(3, 15);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(t);


  }


}
