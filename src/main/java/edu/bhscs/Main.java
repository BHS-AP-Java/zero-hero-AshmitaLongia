// Ashmita Longia
// p2
// Zero Hero
// 9/19/2025

// Descritpion
// input
// output
// edge case

// Field and Property
// constructor

package edu.bhscs;

public class Main {

  // Example of a constant
  // public static final float NAME_OF_THIS_FLOAT = 69.45f;

  // constant value
  public static final char A = 'a';

  public static void main(String[] args) {

    String myString = pushup("garlic");
    System.out.println(myString); // prints "sweetgarlic"

    Baker myBaker = new Baker(); // new baker object calls the constructor Baker.java
    myBaker.flavours(); // calss the flavours method
    Cake myCake = myBaker.bakeCake(); // returns a new cake object

    Awesome Steve = new Awesome("Steve");

    String theGoodStuff = "chocolate";

    Cake TheOneBestCake = new Cake(theGoodStuff);

    TheOneBestCake.eaten(); // calls the eaten method
    System.out.println(
        "Cake left: "
            + TheOneBestCake.getWeight()); // print the current weight of the cake after eating
  }

  public static String pushup(String food) {
    return "sweet" + food; // input is the String food and output is the String "sweet" + food
  }
}

/*  1. abstraction- english -simplifying something
cs- simplifying code by hiding complex deatails

2. replacement - english - substituting something with something else
cs- substituting a complex code with a simpler code

3. class - english - a group of people or things with similar characteristics
cs- a blueprint for creating objects

4. types - english - a category of people or things with similar characteristics
cs- a classification of data that determines the kind of value a variable can hold

5. method - english - a way of doing something
cs- a block of code that performs a specific task

6. int - enlish - a whole number
cs- a data type that represents a 32-bit signed integer

7. string - english - a sequence of characters
cs- a data type that represents a sequence of characters

8. public - english - open to everyone
cs- an access modifier that allows a class, method, or

9. static - english - something that does not change
cs- a keyword that indicates that a method or variable belongs to the class rather than to any

10. constructor- english - a special method that is called when an object is created
cs - a special method that is called when an object is instantiated, used to initialize the object

11. arguments - english - a reason or set of reasons given to persuade others that an action or idea is right or wrong
cs- the values that are passed to a method when it is called

12. parameters - english - a limit or boundary that defines the scope of a particular process or activity
cs- the variables that are defined in a method signature to accept values when the method is called

13. instance  - english - a particular example of something
cs- a specific object created from a class












                */
