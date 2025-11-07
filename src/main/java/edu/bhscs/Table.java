package edu.bhscs;

import javax.swing.table.TableCellEditor;

public class Table {

  private int legs;
  private int width;
  private String top;
  private String leg;
  private int numLegRows;
  private int row;
  public int table;
  private int tableWidth;
  private int centeringMath;


  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    this.top = "-";
    this.leg = "|";
    this.numLegRows = 55;
    this.row = 55;
    this.centeringMath = 0;
    this.tableWidth = 0;
    this.table = table;

  }

  public void setTop(String top) {
    this.top = top;
  }

  public void setLegs(String leg) {
    this.leg = leg;
  }

  public int getWidth() {
    return this.tableWidth = 0;
  }

  public void centerLength() {
    int cakeWidth = this.width;
    int offset = (tableWidth - cakeWidth) / 2;
    int tableOffset = 0;
    int cakeOffset = 0;
    if (tableWidth > cakeWidth) {
      tableOffset = 0;
      cakeOffset = Math.abs(offset);

    } else {
      cakeOffset = 0;
      tableOffset = Math.abs(offset);
    }
  }

  public void draw() {
    for (int i = 0; i < width; i++) {
      System.out.print(top);
    }
    System.out.println();

    for (int row = 0; row < numLegRows; row++) {
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

