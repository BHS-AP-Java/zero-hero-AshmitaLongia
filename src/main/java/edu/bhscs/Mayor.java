package edu.bhscs;

public class Mayor {
  // properties
  // 1. person
  // 2. he gives a speech
  // 3. user
  //
  //
  Player user; // user is a field
  String name; // name is a field

  public Mayor() { // public mayor is a property
    this.name = "THE MAYOR"; // this is the method body
  }

  // constructor
  public Mayor(Player user, String name) { // this isa constructor with parameters
    this.user = user;
  }
}
