import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args){
        Random r = new Random();
        Scanner i = new Scanner(System.in);
        int number;
        int attempt = 0;
        int guess = 0;
        number = r.nextInt(1, 101);
        System.out.println("Guess the number between 1 to 100.");

        do {
            System.out.print("Guess the number: ");
            guess = i.nextInt();

            if (guess > 100){
                System.out.println("Enter a valid input!");
            }
            else if (guess < number){
                System.out.println("To Low!");
                attempt += 1;
            }
            else if (guess > number){
                System.out.println("To High!");
                attempt += 1;
            }
        }
        while (guess != number);
        System.out.println("You guessed the right number!.");
        System.out.println("You take " + attempt + " attempts");
    }
}