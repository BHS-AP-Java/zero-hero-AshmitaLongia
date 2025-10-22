package edu.bhscs;

// Fields
public class Cake {
  String frosting;
  String flour;
  String flavor;
  String customerName;
  int price;
  int width;
  int slope;
  int weight;

  // Constructor
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
    this.flavor = flavor;
    this.customerName = customerName;
    this.width = width;
    this.slope = slope;
    this.weight = weight;
    this.flour = flour;
  }

  // Draw method
  public void draw(String icing, int x, int y, String name, String age) {
    System.out.println("I am drawing");

    // Looping through each row for height
    for (int count = 0; count < x; count++) {
      // Looping through each column for width
      for (int i = 0; i < y; i++) {
        System.out.print(icing); // Pring the icing
      }
      System.out.println(); // Move to the next line after each row

      System.out.println("###################");
    }
  }
}
