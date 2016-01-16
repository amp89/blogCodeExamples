import java.util.Scanner;

public class ScannerImport{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Write something, and it will print: ");
    String toPrint = keyboard.nextLine();
    System.out.println(toPrint);
  }
}
