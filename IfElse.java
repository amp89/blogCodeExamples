import java.util.Scanner;

public class IfElse{

  public static void main(String[] args){

    String y;

    System.out.println("This is an example of an If/Else statement in Java");
    System.out.print("Type a number 0-4: ");
    Scanner keyboard = new Scanner(System.in);
    int x = keyboard.nextInt();


    if (x==0)
    {
      y = "zero";
    }
    else if (x == 1)
    {
      y = "one";
    }
    else if (x==2)
    {
      y = "two";
    }
    else if (x==3)
    {
      y = "three";
    }
    else if (x==4)
    {
      y = "four";
    }
    else
    {
      y = "error";
    }

    System.out.println(y);

  }

}
