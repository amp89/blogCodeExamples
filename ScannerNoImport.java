public class ScannerNoImport{
  public static void main(String[] args){
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    //"java.util" must be used before "Scanner"
    System.out.print("Write something, and it will print: ");
    String toPrint = keyboard.nextLine();
    System.out.println(toPrint);
  }
}
