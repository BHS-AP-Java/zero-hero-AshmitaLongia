package edu.bhscs;

import java.util.Scanner;

public class Player {

  public static void main(String[] args) {

    String name;

    Scanner s = new Scanner(System.in); // scanner is a scanner property
  }

  public Player(String name) {
    this.name = name;
    this.s = new Scanner(System.in);
  }

  public void answerQuestions() {
    System.out.println("What's your question?");
    String question;
    System.out.println(question + "is a dumb question");
  }
}
