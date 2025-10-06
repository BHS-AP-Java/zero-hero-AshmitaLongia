package edu.bhscs;

public class Baker {

  public Baker() {
    System.out.println("Hello, I am the baker");
    System.out.println("I can bake the following cake flavours:");
  }

  public Cake bakeCake() {
    return new Cake("chocolate");
  }
}
