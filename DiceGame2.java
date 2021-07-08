import java.util.Random;
import java.util.Scanner;

public class DiceGame2 {
        public static void main(String[] args) {

            int value1,value2;
            String name;
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println("What is your name?");
            System.out.print("> ");
            name=scanner.next();
            System.out.println("Hello, "+name+"!");

            value1=rand.nextInt(6)+1;
            value2=rand.nextInt(6)+1;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: "+value1);
            System.out.println("Die 2: "+value2);
            System.out.println("Total value: "+(value1+value2));
        }
}
