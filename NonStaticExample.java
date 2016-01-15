public class NonStaticExample{
  public NonStaticExample(){
    //This is a constructor in its default state
    //the compiler will do this automatically if
    //the programmer doesn't put a constructor here
  }

  static void printMe(String thingToPrint){
    System.out.println(thingToPrint);
  }
}
