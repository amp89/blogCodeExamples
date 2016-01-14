public class ParametersAndArguments{
  public static void main(String[] args){

    int x = 2;
    printStuff(x); //x is the argument
  }

  //Below, y is the parameter.  It stores
  //the value from the argument "x" for
  //use wthin the "printStuff" method.
  public static void printStuff(int y){
    System.out.println(y);
  }

}
