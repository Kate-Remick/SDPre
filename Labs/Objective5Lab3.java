public class Objective5Lab3 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number.");
    userNum = keyboard.nextInt();

    if(userNum == 0) {
      System.out.println("The number is zero.");
    }
    else if(userNum > 0) {
      System.out.println("The number is positive");
    }
    else if(userNum < 0) {
      System.out.println("The number is negative.");
    }

      keyboard.close();
  }
}
