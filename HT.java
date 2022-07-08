import java.util.Random;
import java.util.Scanner;

public class HT {

  public static void main(String[] args) {
      
    String[] hands = { "Heads", "Tails"};
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    int count = 0;

    System.out.println("Who are you?");
    System.out.print(">");

    String name = sc.nextLine();
    System.out.println("Hello, "+name+"!");

    System.out.println("Tossing a coin...");
    for(int i=0 ; i<3 ; i++) {
      String hand = hands[r.nextInt(2)];
      int j = i + 1;
      if(hand == hands[0])count++;
      System.out.println("Round "+j+": "+hand);
      
    }
    int x = 3 - count;
    System.out.println("Heads: "+count+", Tails: "+x);
    if(count>x){
	System.out.println(name+" Won!");
    }
    if(count<x){
	System.out.println(name+" lost.");
    }
   
   
  }

}
