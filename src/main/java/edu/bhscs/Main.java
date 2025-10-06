// Ashmita Longia
// p2
// Zero Hero
// 9/19/2025

// Descritpion - A bakery shop, buy whatever cake you want
// input - customer name, cake flavor
// output - ptsa gets richer, customers get cake
// edge case - all the cakes are sold out

// Field and Property
// constructor
// method

package edu.bhscs;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("What can we do with a scanner");
    System.out.println("What is your favorite cake flavor");
    System.out.println("I dont know, but im done now");
    String color = s.next();

    System.out.println("Your favorite cake flavor is " + color);

    s.next();
    s.close();
  }
}
