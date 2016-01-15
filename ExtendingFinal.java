public class ExtendingFinal extends NonStaticExampleFinal{
  //**************************************************
  //this fails to compile, since NonStaticExampleFinal
  //is a final class.
  //***************************************************

  public static void main(String[] args){

    printMe("This is a method from NonStaticExample!");
    System.out.println("This is new stuff!");



  }

}
