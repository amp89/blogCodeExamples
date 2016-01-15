public class Extending extends NonStaticExample{


  public static void main(String[] args){
    //this has the capabilities from NonStaticExample
    //but we are also able to add new things
    //it can be extended since it is not a Static class
    //It would be impossible to try to extend
    //the class "StaticExample," since it is private.
    printMe("This is a method from NonStaticExample!");
    System.out.println("This is new stuff!");



  }

}
