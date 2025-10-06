package edu.bhscs;

public class Cake {
  String flavor;
  String flour;
  String customerName;
  int weight;

  public Cake(String flavor, String flour, String customerName) {

    this.weight = 10;
    this.flavor = flavor;
    this.flour = flour;
    this.customerName = customerName;
    System.out.println("Baking a " + flavor + " cake for " + customerName + "...");
    System.out.println("Using ingredients: " + flour.toString() + ", sugar, eggs, butter");
  }

  public void eaten() {
    if (this.weight > 0) {
      this.weight = this.weight - 1;
      System.out.println("Cake is all gone");
    } else {
      System.out.println(
          customerName + " ate some " + flavor + " cake. Remaining weight: " + weight + " lbs.");
    }
  }

  public int getWeight() {
    return this.weight;
  }
}
