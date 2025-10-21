package edu.bhscs;

public class Bakery {
  String name;
  PTSA owner;

  public Bakery(String name, PTSA owner) {
    this.name = name;
    this.owner = owner;
    System.out.println("The bakery " + name + " is owned by " + owner.getName());
  }

  /// method this goes into bakery
  public Bakery createBakery(Player p, String name) {
    System.out.println("What is the name of your bakery?");
    PTSA owner = new PTSA(p.name);
    String bakeryName = p.giveAnswer("What is the name of your bakery?");
    return new Bakery(bakeryName, owner);
  }

  public String getName() {
    return this.name;
  }
}
