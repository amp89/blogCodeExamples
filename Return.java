public class Return{
  public static void main(String[] args){

    int x=2,y=10,z;

    // Here multiplyAndReturn is passed the
    // variables x and y, and returns a value which
    //is assigned here to z
    z = multiplyAndReturn(x,y);
    System.out.println("z was returned from multiplyAndReturn");
    System.out.println("z is " + z);

    //the multiply is called, and it multiplies x and z
    //and assigns it to a variable the same way as the
    //multiplyAndReturn method, however there is no
    //return type, only void, so nothing comes out
    //of that method.
    multiply(x,y);
    System.out.print("\nThe method multiply() was called,");
    System.out.print(" however there is no way to return\n anything");
    System.out.println(" since it was declared with a \"void\"");



  }

  //method without a return type
  //this cannot return anything, or there will be an error.
  public static void multiply(int x, int y){
    int result = x*y;
    

  }
  //method with a return type
  //this must return an int, or there will be an error
  public static int multiplyAndReturn(int x, int y){
    int result = x*y;
    return result;
  }



}
