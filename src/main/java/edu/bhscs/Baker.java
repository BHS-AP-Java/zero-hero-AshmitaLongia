package edu.bhscs;

public class Baker { // class represents a baker

  // This is a constructor/ called when a new baker object is created
  public Baker() {
    System.out.println("Baker created");
  }

  public Cake bakeCake() { // mehtod that bakes a cake and returns a cake object
    return new Cake("chocolate"); // always bakes a chocolate cake rn
  }

  public void flavours() { // method that prints out the flavours of cakes to choose from
    System.out.println("More Cake flavours---:");
    System.out.println("- Orange");
    System.out.println("- Vanilla");
    System.out.println("- Strawberry");
    System.out.println("- Chocolate");
  }
}
