public class StaticObject{

  public static void main(String[] args){

    String myString = "Print This!";

    StaticExample.printMe(myString);

    //This file will not compile if
    //the statement below were included, because
    //StaticExample is marked private,
    //therefore a new Object cannot be instantiated.
    //StaticExample newObject = new StaticExample();
  }

}
