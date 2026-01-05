package edu.bhscs;

public class Burger {
  // fields and properties
  // constructor
  // methods
  String name;
  int price = 5;

  public static String breadGuts(int width) {
    String guts = "";
    for (var i = 0; i < width; i++) {
      guts += "=";
    }
    return guts;
  }

  public static void draw() {
    for (int i = 0; i < 10; i++) {
      System.out.println(
          " // " + breadGuts(10) + "\\\\"); // escape character- does not end the string
    }
  }

  public void beEaten(final String name) { // string is a type
    System.out.println("The Burger" + name + " is all gone");
    System.out.println("You have been charged $" + price);
  }
}
