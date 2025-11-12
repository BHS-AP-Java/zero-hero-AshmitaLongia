package edu.bhscs;

import java.util.Random;

public class Cake implements Offsetable {

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

  public Cake(String frosting, int price, String flavor, String customerName, int width, int slope,
      int weight, String flour) {
    this.frosting = frosting;
    this.price = price;
    this.flavor = flavor.toLowerCase();
    this.customerName = customerName;
    this.width = width;
    this.slope = slope;
    this.weight = weight;
    this.flour = flour;
  }

  @Override
  public int getWidth() {
    return width;
  }


  @Override
  public void draw(Offsetable below) {
    int offset = getOffset(below);

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

    Random rand = new Random();
    int rows = 5;
    int cols = width;


    for (int r = 0; r < rows; r++) {
      System.out.print(" ".repeat(offset));
      for (int c = 0; c < cols; c++) {
        if (rand.nextInt(4) == 0) {
          System.out.print(mainColor + "’" + RESET);
        } else {
          System.out.print(mainColor + "~" + RESET);
        }
      }
      System.out.println();
    }

    if (customerName != null && !customerName.isEmpty()) {
      int textOffset = offset + (width - customerName.length()) / 2;
      System.out.println(" ".repeat(textOffset) + customerName);
    }
  }
}
