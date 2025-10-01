package edu.bhscs;

/*
class myProgram {
  // this is an example of a "char" consent
  // because it is global, it should be in capital letters
  public static final String Y = "YES";
  public static final String N = "NO";

  public static void main(String[] args) {

    String favFood1 = "Seafood";
    String favFood2 = "Pasta";

    String notfavFood1 = "Pepperoni Pizza";
    String notfavFood2 = "Hawaiian Pizza";

    String ratingFav = "a lot";
    String ratingnotFav = "ew";

    System.out.println("Welcome to Ashmita's fav and dislikable foods list");
    System.out.println("  ");

    // fav foods
    System.out.println(favFood1 + " " + Y + " " + ratingFav);
    System.out.println(favFood2 + " " + Y + " " + ratingFav);

    // disliked foods
    System.out.println(notfavFood1 + " " + N + " " + ratingnotFav);
    System.out.println(notfavFood2 + " " + N + " " + ratingnotFav);

    // end
    System.out.println();
    System.out.println("Thank you for listening bye");
  }
}
*/

public class Awesome {
  String name;
  String knowledge;

  // we need to construct something awesome
  public Awesome(String name) {
    System.out.println("I am awesome");
    this.name = name;
  }

  // methods are the ability of the class/type
  String getName(String newName) {

    return "I cant remeber who i am" + newName;
  }

  String getName() {
    return this.name;
  }

  void learnSomething(String knowledge) {
    this.knowledge = knowledge;
  }

  String getKnowledge() {
    return this.knowledge;
  }
  ;
}
