public class Objective9Lab5 {
  public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int selection = 0;
    double num1, num2;
    System.out.println("What is your first number?");
    num1 = kb.nextDouble();
    System.out.println("What is your second number?");
    num2 = kb.nextDouble();

    while(selection != 4) {
    System.out.println("Make a selection:");
    printMenu();
    selection = kb.nextInt();
    switch(selection) {
      case 1:
      double finalSum = findSum(num1, num2);
      System.out.println("The sum of " + num1 + " and " + num2 + " is " + finalSum);
      break;
      case 2:
      double average = findAverage(num1, num2);
      System.out.println("The average of " + num1 + " and " + num2 + " is " + average);
      break;
      case 3:
      double taxFinal = calcTax(num1, num2);
      System.out.println("The tax for " + num1 + " and " + num2 + " is " +taxFinal);
      break;
      case 4:
      System.out.println("Goodbye");
      break;
      default:
      System.out.println("I don't recognize that input.");
      }
    }
      kb.close();
  }

  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }
  public static double findAverage(double x, double y) {
    double average = (x + y)/2;
    return average;

  }
  public static double calcTax(double x, double y) {
    double tax = 0.0831*(x + y);
    return tax;
  }
  public static void printMenu(){
    System.out.println("======== Menu =========");
    System.out.println("|                     |");
    System.out.println("|   1. Add Numbers    |");
    System.out.println("|   2. Find Average   |");
    System.out.println("|   3. Calculate tax  |");
    System.out.println("|   4. Exit           |");
    System.out.println("|                     |");
    System.out.println("=======================");
    System.out.println();
  }
}
