import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your first name?");
    String fname = keyboard.next();
    System.out.println("My first name is " + fname);


    System.out.println("What is your last name?");
    String lname = keyboard.next();
    System.out.println("My last name is " + lname);

    System.out.println("What is your favorite animal?");
    String favoriteAnimal = keyboard.next();
    System.out.println("My favorite animal is " + favoriteAnimal);

    System.out.println("What is your favorite food?");
    String favoriteFood = keyboard.next();
    System.out.println(favoriteFood);

    System.out.println("What is your favorite song?");
    String favoriteSong = keyboard.next();
    System.out.println("My favorite song is " + favoriteSong);

  }
}
