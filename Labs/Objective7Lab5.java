public class Objective7Lab5 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    int selection = 0;

    while (selection != 3) {
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List my favorite foods");
    System.out.println("3: Exit");

    selection = keyboard.nextInt();

    switch(selection) {
      case 1:
      System.out.println("Hello World");
      break;
      case 2:
      System.out.println("Apple, banana, coconut.");
      break;
      case 3:
      System.out.println("Goodbye");
      break;
      default:
      System.out.println("I'm sorry, I don't recognize that selection.");
    }

    }

    keyboard.close();
  }
}
