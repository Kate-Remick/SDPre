public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while(counter <= 20){
      int remainder = counter % 2;
      if(remainder  == 0) {
        System.out.println(counter + " is even");
      }
      else{
        System.out.println(counter + " is odd");
      }
      counter = counter + 1;
    }
  }
}