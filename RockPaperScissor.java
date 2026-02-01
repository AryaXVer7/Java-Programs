package Projects;
import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("***********************************\nWelcome to Rock Paper Scissor Game!\n***********************************\n");
        String[] opt = {"rock", "paper", "scissor"};
        String userInput;
        String computerChoice;
        String playAgain = "Yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            System.out.print("Choose from (Rock or Paper or Scissor): ");
            userInput = scanner.nextLine().toLowerCase();

            if (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissor")) {
                System.out.print("Invalid Input");
                break;
            }

            computerChoice = opt[random.nextInt(opt.length)];
            System.out.println("Computer choice: " + computerChoice);

            if (userInput.equals(computerChoice)) {
                System.out.print("It's tie!");
            } else if (userInput.equals("rock") && computerChoice.equals("scissor") || userInput.equals("scissor") && computerChoice.equals("paper") || userInput.equals("paper") && computerChoice.equals("rock")) {
                System.out.print("You win!");
            } else {
                System.out.print("You lose!");
            }
            System.out.println();
            System.out.print("Do you want to play again(Yes or No): ");
            playAgain = scanner.nextLine().toLowerCase();
        }
        if (playAgain.equalsIgnoreCase("No")){
            System.out.println("Bye");
        }
    }
}
