import java.util.Random;

public class HT {

  public static void main(String[] args) {
      
    String[] hands = { "Heads", "Tails"};
    Random r = new Random();
    int count = 0;

    System.out.println("Tossing a coin...");
    for(int i=0 ; i<3 ; i++) {
      String hand = hands[r.nextInt(2)];
      int j = i + 1;
      if(hand == hands[0])count++;
      System.out.println("Round "+j+": "+hand);
      
    }
    int x = 3 - count;
    System.out.println("Heads: "+count+", Tails: "+x);
   
   
  }

}
