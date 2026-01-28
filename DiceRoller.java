package Projects;
import java.util.*;
public class DiceRoller {
    static Random r = new Random();
    static int noRoll;
    static int total = 0;
    public static void main(String[] args) throws InterruptedException{
        Scanner i = new Scanner(System.in);

        System.out.print("Enter number of dice you want to roll: ");
        noRoll = i.nextInt();
        if (noRoll <= 0) {
            System.out.print("Invalid!..Exiting..");
        }
        else {
            System.out.println("Rolling " + noRoll + " dice...");
            Thread.sleep(1000);
            diceroll(noRoll);
        }
    }
    static void diceroll(int noRoll){

        for (int i = 1; i <= noRoll; i++) {

            int index = r.nextInt(1,7);

            String  d1 = "+-------+\n|       |\n|   o   |\n|       |\n+-------+";
            String  d2 = "+-------+\n| o     |\n|       |\n|     o |\n+-------+";
            String  d3 = "+-------+\n| o     |\n|   o   |\n|     o |\n+-------+";
            String  d4 = "+-------+\n| o   o |\n|       |\n| o   o |\n+-------+";
            String  d5 = "+-------+\n| o   o |\n|   o   |\n| o   o |\n+-------+";
            String  d6 = "+-------+\n| o   o |\n| o   o |\n| o   o |\n+-------+";

            switch(index) {
                case 1 -> System.out.println(d1);
                case 2 -> System.out.println(d2);
                case 3 -> System.out.println(d3);
                case 4 -> System.out.println(d4);
                case 5 -> System.out.println(d5);
                case 6 -> System.out.println(d6);
                default -> System.out.println("Invalid");
            }
            System.out.println("You rolled: " + index);
            total += index;
        }
        System.out.print("Total sum of dice: " + total);
    }
}
