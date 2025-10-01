package edu.bhscs;

// Field and Property
// constructor
// method

public class Flour {
  public String name;
  public int lbs;
  public int price;
  public int quality;

  public Flour(int price, int lbs) {
    this.price = price;
    this.lbs = lbs;
    this.quality = 10;
  }

  public void goesBad() {
    this.quality = 0;
  }
}
;
