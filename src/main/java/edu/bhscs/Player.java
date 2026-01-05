package edu.bhscs;

import java.util.Scanner;

public class Player {

  Scanner input = new Scanner(System.in);
  public String name;

  public String giveAnswer(String question) {
    System.out.println(question);
    return input.nextLine();
  }

  public void accomplish(int amount) {
    System.out.println("Player improved by " + amount + "!");
  }
}
