public class DotEquals{
  public static void main(String[] args){
    String x = "Hello!";

    if (x.equals("Hello!")){ //the .equals compares string values, the same way == compares numerical values.
      System.out.println("x must be equal to \"Hello!\"");
    }

    if ("Hello!".equals(x)){
      System.out.println("This works too!");
    }

    if ("Hi!".equals("Hi!")){
      System.out.println("And so does this!");
    }

  }
}
