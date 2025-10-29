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

    App date10_27 = new App();
    date10_27.runApp();

    Player player = new Player();
    Flour flour = new Flour(20, 1);
    Store store = new Store("Sweet Treats Bakery");
    Customer customer = new Customer("Poopy Pants");

    Baker baker = new Baker(player, flour, store, customer);
    baker.takeJob(store);

    Scanner s = new Scanner(System.in);

    System.out.println(
        "What is your favorite cake flavor? (chocolate, vanilla, strawberry, lemon)");
    String flavor = s.nextLine().toLowerCase();

    System.out.println("Your favorite cake flavor is " + flavor + "!");
    System.out.println("Making you a " + flavor + " cake!");

    Cake myCake =
        new Cake(
            flavor + " frosting",
            20, // price
            flavor, // flavor
            "Customer", // customerName
            5, // width
            3, // heigth
            2, // weight
            "Wheat" // flour
            );

    myCake.draw("~~", 5, 15, "Customer", "16");

    s.close();
  }
}
