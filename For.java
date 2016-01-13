public class For{
  public static void main(String[] args){

    int x = 0;

    //this loop will run 10 times
    //i starts at 0, and one is added after each loop.
    //the loop will not run if i is greater or equal to 10.
    for(int i = 0; i<10; i++){
      x++;
      System.out.println("This is iteration #"+x);
    }

  }
}
