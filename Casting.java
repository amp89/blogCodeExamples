public class Casting{
  public static void main(String[] args){

    double x = 4.564654;
    int y;

    //the "(int)" changes the x to an integer, a
    //value that can be held by y, by dropping
    //everything after the decimal point
    y = (int)x;

    System.out.println("double x is: " + x);
    System.out.println("int y is: " + y);


  }
}
