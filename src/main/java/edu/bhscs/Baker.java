package edu.bhscs;

public class Baker {
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;
  int skill;
  String name = "Poopy Pants";
  Customer c;

  public Baker(Player p, Flour f, Store placeOfWork, Customer c) {
    this.p = p;
    this.f = f;
    this.placeOfWork = placeOfWork;
    this.c = c;
    this.skill = 1;
    this.cash = 0;
  }

  public void takeJob(Store bakery) {
    String doYouWantToWorkHere =
        this.p.giveAnswer("Do you want to work at " + bakery.getName() + "?");
    if (doYouWantToWorkHere.equalsIgnoreCase("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    } else {
      System.out.println(this.name + " chose not to work at " + bakery.getName());
    }
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("What cake do you want?");
    return new Cake("Chocolate", 10, answer, "CustomerName", 5, this.skill, 2, "Wheat");
  }

  public void learn(int amount) {
    this.skill += amount;
    this.p.accomplish(amount);
  }
}
