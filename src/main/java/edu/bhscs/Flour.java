package edu.bhscs;

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

  public void age() {
    this.quality = this.quality - 1;
  }

  public int getlbs() {
    return this.lbs;
  }

  public int getPrice() {
    return this.price;
  }

  public int getQuality() {
    return this.quality;
  }

  public String toString() {
    return String.valueOf(" Flour - " + lbs + " lbs - $" + price + " - Quality: " + quality);
  }
}
;
