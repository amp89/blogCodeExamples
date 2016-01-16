public class NonStaticObject{
  public static void main(String[] args){

    //now we can make an instance variable call the method.
    //if, in NonStaticExample.java, the constructor was marked private,
    //this code would not compile.
    NonStaticExample exampleObject = new NonStaticExample();
    exampleObject.printMe("This Will Print");
  }
}
