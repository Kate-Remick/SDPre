public class Objective5Lab4 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    double userDub;
    System.out.println("Enter a number.");
    userDub = keyboard.nextDouble();

    double remainder = userDub % 2;

    if(userDub == 0) {
      System.out.println("The number is 0");
    }
    if(remainder == 0 && userDub != 0) {
      System.out.println("The number is even.");
    }
    else if(remainder == 1) {
      System.out.println("The number is odd.");
    }
    else if(remainder != 0 && remainder !=1) {
      System.out.println("The number is not an interger.");
    }

    keyboard.close();
  }
}
