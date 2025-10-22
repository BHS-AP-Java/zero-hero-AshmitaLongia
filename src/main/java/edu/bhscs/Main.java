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
    Player player = new Player();
    Flour flour = new Flour(20, 1);
    Store store = new Store("Sweet Treats Bakery");
    Customer customer = new Customer("Poopy Pants");

    Baker baker = new Baker(player, flour, store, customer);
    baker.takeJob(store);
    Store myBakery = new Store("Poopy Pants Bakery");

    System.out.println();
    System.out.println();

    Scanner s = new Scanner(System.in);

    System.out.println("What is you favorite cake flavor?");
    String flavor = s.nextLine();

    System.out.println("Your favorite cake flavor is " + flavor + "!");
    System.out.println("Making you a " + flavor + " cake!");

    System.out.println();
    System.out.println();

    Cake myCake = new Cake(flavor, 20, "idk", "alalal", 5, 3, 2, "Wheat");
    myCake.draw("~~", 3, 9, null, null);

    s.close();
  }
}
