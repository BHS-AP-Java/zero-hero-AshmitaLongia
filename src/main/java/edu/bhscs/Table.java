package edu.bhscs;

public class Table implements Offsetable {

  private int legs;
  private int width;
  private String top;
  private String leg;
  private int numLegRows;

  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    this.top = "-";
    this.leg = "|";
    this.numLegRows = 5; 
  }

  public void setTop(String top) {
    this.top = top;
  }

  public void setLegs(String leg) {
    this.leg = leg;
  }

  @Override
  public int getWidth() {
    return width;
  }

  @Override
  public void draw(Offsetable below) {
    int offset = getOffset(below);

    // Draw the tabletop
    System.out.print(" ".repeat(offset));
    for (int i = 0; i < width; i++) {
      System.out.print(top);
    }
    System.out.println();

    // Draw the legs
    for (int row = 0; row < numLegRows; row++) {
      System.out.print(" ".repeat(offset));
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
