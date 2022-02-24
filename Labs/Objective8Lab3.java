public class Objective8Lab3 {
  public static void main(String[] args) {
    int count = 1;

    for(count = 1; count <= 20; count ++) {
      int remainder = count % 2;
      switch(remainder) {
        case 0:
        System.out.println(count + " is even");
        break;
        case 1:
        System.out.println(count + " is odd");
        break;
        default:

      }
    }

  }
}
