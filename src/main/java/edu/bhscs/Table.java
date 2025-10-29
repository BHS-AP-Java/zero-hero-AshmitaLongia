package edu.bhscs;

public class Table {

  private int legs;
  private int width;
  private String top;
  private String leg;

  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    this.top = "-";
    this.leg = "|";
  }

  public void setTop(String top) {
    this.top = top;
  }

  public void setLegs(String leg) {
    this.leg = leg;
  }

  public void draw() {

    for (int i = 0; i < width; i++) {
      System.out.print(top);
    }
    System.out.println();

    for (int row = 0; row < 1; row++) {
      for (int col = 0; col < width; col++) {

        if (col % (width / (legs - 1)) == 0) {
          System.out.print(leg);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
