import java.util.Random;

public class DiceGame {
        public static void main(String[] args) {

            int value1,value2;
            Random rand = new Random();
            value1=rand.nextInt(6)+1;
            value2=rand.nextInt(6)+1;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: "+value1);
            System.out.println("Die 2: "+value2);
            System.out.println("Total value: "+(value1+value2));

        }
}