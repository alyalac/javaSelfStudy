// == (Equal to) -> 10 == 10 (True), 10 == 5 (False)
// != (Not equal to) -> 10 != 5 (True), 10 != 10 (False)
// >  (Greater than) -> 15 > 10 (True), 10 > 15 (False)
// <  (Less than) -> 5 < 10 (True), 10 < 5 (False)
// >= (Greater than or equal to) -> 10 >= 10 (True), 11 >= 10 (True), 9 >= 10 (False)
// <= (Less than or equal to) -> 5 <= 5 (True), 4 <= 5 (True), 6 <= 5 (False)

package javaStudy.ConditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {

  public static void andLogical() {

    boolean myHeart = true;
    boolean mySoul = true;

    if (myHeart && mySoul) {
      System.out.println("HUMAN");
    } else {
      System.out.println("OUTTT");
    }

  }

  public static void compareString() {

    Scanner sc = new Scanner(System.in);
    System.out.print("6..??");
    int sixseven = sc.nextInt();

    if (sixseven == 7) {
      System.out.println("67676767!!");
    } else if (sixseven == 67) {
      System.out.println("67!!!!");
    } else {
      System.out.println("OH noo!!");
    }
    sc.close();

  }

  public static void nestedCondition() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age:");
    int age = sc.nextInt();

    boolean isVerified = true; // or False you have access but not qualified

    if (age >= 18) {
      System.out.println("You have Access");
      if (isVerified) {
        System.out.println("Qualified");
      } else {
        System.out.println("Not Qualified");
      }
    }
    sc.close();
  }

  public static void ifElse() { // if-else if-else Statement

    Scanner sc = new Scanner(System.in); // Scanner

    System.out.print("Enter your age:"); // sc
    int legalAge = sc.nextInt();

    if (legalAge >= 18) {
      System.out.print("You Have Access");
    } else if (legalAge >= 13) {
      System.out.print("You Need Parent Consent");
    } else {
      System.out.println("Access Denied!");
    }
    sc.close();
  }

  public static void booleanIfElse() { // else if

    boolean loyalty = true;

    if (loyalty) {
      System.out.println("\nLoyalty: " + true);
    } else {
      System.out.println("Loyalty" + true);
    }
  }

  public static void moreConditionalExpressions() { // if - elseif - else statement

    System.out.println("Option: Orange,Red,Blue");

    Scanner sc = new Scanner(System.in);

    String myFavoriteColor = "Blue";
    System.out.print("Guess my favorite color:");
    String guess = sc.nextLine();

    if (guess.equals(myFavoriteColor)) {
      System.out.println("Goods");
    } else if (guess.equals("Orange")) {
      System.out.println("Ngek!");
    } else if (guess.equals("Red")) {
      System.out.println("Wrong!");
    } else {
      System.out.println("Out");
    }
    sc.close();
  }

  public static void main(String[] args) {

    andLogical();

    compareString();

    nestedCondition();

    ifElse();

    booleanIfElse();

    moreConditionalExpressions();

  }

}
