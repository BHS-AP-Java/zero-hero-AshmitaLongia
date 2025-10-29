package edu.bhscs;

import java.util.Random;

public class Cake {

  String frosting;
  String flour;
  String flavor;
  String customerName;
  int price;
  int width;
  int slope;
  int weight;

  // Colors
  public static final String RESET = "\u001B[0m";
  public static final String YELLOW = "\u001B[33m";
  public static final String WHITE = "\u001B[37m";
  public static final String BROWN = "\u001B[38;5;94m";
  public static final String PINK = "\u001B[95m";

  public Cake(
      String frosting,
      int price,
      String flavor,
      String customerName,
      int width,
      int slope,
      int weight,
      String flour) {
    this.frosting = frosting;
    this.price = price;
    this.flavor = flavor.toLowerCase();
    this.customerName = customerName;
    this.width = width;
    this.slope = slope;
    this.weight = weight;
    this.flour = flour;
  }

  // Draw cake with sprinkles
  public void draw(String icing, int rows, int cols, String name, String age) {
    Random rand = new Random();

    String mainColor;
    switch (flavor) {
      case "chocolate":
        mainColor = BROWN;
        break;
      case "vanilla":
        mainColor = WHITE;
        break;
      case "strawberry":
        mainColor = PINK;
        break;
      case "lemon":
        mainColor = YELLOW;
        break;
      default:
        mainColor = RESET;
        break;
    }

    System.out.println("Making a " + flavor + " cake for " + customerName + "!");

    // Loop through each row (height)
    for (int r = 0; r < rows; r++) {
      // Loop through each column (width)
      for (int c = 0; c < cols; c++) {
        // 1 in 4 chance to put a sprinkle
        if (rand.nextInt(4) == 0) {
          System.out.print(mainColor + "’" + RESET); // sprinkle
        } else {
          System.out.print(mainColor + "~" + RESET); // regular icing
        }
      }
      System.out.println(); // end of row
      System.out.println("################"); // table layer
    }
  }
}
