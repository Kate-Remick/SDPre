public class Objective9Lab3 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    int selection = 0;

    while(selection !=3){
      printMenu();
      selection = keyboard.nextInt();
      switch(selection) {
        case 1:
        System.out.println("Hello, world");
        break;
        case 2:
        System.out.println("Apple, banana, coconut");
        break;
        case 3:
        System.out.println("Goodbye");
        break;
        default:
        System.out.println("I don't recognize that input.");

      }

    }
    keyboard.close();
  }
  public static void printMenu(){
    System.out.println("____Menu____");
    System.out.println("1. Say Hello");
    System.out.println("2. List Favorite Foods");
    System.out.println("3. Exit");
    System.out.println();
  }
}
