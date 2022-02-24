import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;
    currentYear = 2022;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("How old are you?");
    age = keyboard.nextInt();
    birthYear = currentYear - age;
    System.out.println("You were born in " + birthYear + ".");
    keyboard.close();

  }
}
