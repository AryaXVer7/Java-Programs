package Projects;
import java.util.*;
public class JavaQuiz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] ques = {"What is the main function of a routes?",
                         "Which part of the computer is considered as brain?",
                         "Who is known as the father of computer science?",
                         "What is the first programing language?"};
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. Steve Jobs", "3. Alan Turing", "3. Bill Gates", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] ans = {3, 1, 2, 3};
        int score = 0;
        int guess;

        System.out.print("*********************************\n Welcome To Java Quiz Program\n*********************************\n");
        for (int i = 0; i < ques.length; i++){
            System.out.println(ques[i]);
            for (String opt : options[i]){
                System.out.println(opt);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == ans[i]){
                System.out.print("*******\nCorrect\n*******\n");
                score += 1;
            }
            else{
                System.out.print("*******\n Wrong\n*******\n");
            }
            System.out.print("Your score is: " + score);
        }
    }
}
