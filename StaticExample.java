public class StaticExample{
  private StaticExample(){
    //This is the constructor
    //Since it is marked private,
    //an ojbect cannot be made of
    //this class.
  }

  static void printMe(String thingToPrint){

    System.out.println(thingToPrint);
  }
}
