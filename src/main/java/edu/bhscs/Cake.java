package edu.bhscs;

public class Cake { // the class contains the ingredients and weight of the cake
  String ingredients; // instance variable for ingredients
  String otherIngredients;
  String Flour;
  int weight;

  public Cake(String ingredients) { // constructor that takes in the ingredients of the cake
    this.ingredients = ingredients;
    this.otherIngredients = "flour, sugar";
    this.weight = 10;
    this.Flour = Flour;
    this.weight = 10;
    System.out.println(
        "Baking the cake with: " + this.ingredients + " and " + this.otherIngredients);
    // output of what the cake is being baked with
  }

  public void eaten() { // someone eats the cake, weight decreases by 2
    this.weight = this.weight - 2;
    System.out.println("Someone ate some cake! Remaining weight: " + this.weight);
  }

  public int getWeight() { // return method for the current weight of the cake
    return this.weight;
  }
}
