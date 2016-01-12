import java.util.Scanner;

public class Switch{

  public static void main(String[] args){

    String y;

    System.out.println("This is an example of a switch in Java");
    System.out.print("Type a number 0-4: ");
    Scanner keyboard = new Scanner(System.in);
    int x = keyboard.nextInt();

    switch (x){
      case 0: y = "zero";
        break;
      case 1: y = "one";
        break;
      case 2: y = "two";
        break;
      case 3: y = "three";
        break;
      case 4: y = "four";
        break;
      default: y = "error";
        break;

    }

    System.out.println(y);

  }

}
