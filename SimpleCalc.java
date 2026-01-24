import java.util.*;
public class SimpleCalc {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        double n1;
        double n2;
        double result = 0 ;
        char choice;
        boolean validChoice = true;
        System.out.println("Welcome to Simple Calculator!");
        System.out.print("Enter your choice (+,-,*,/): ");
        choice = i.next().charAt(0);
        System.out.print("Enter number 1: ");
        n1 = i.nextDouble();
        System.out.print("Enter number 2: ");
        n2 = i.nextDouble();
        switch (choice){
            case '+' -> result = (n1+n2);
            case '-' -> result = (n1-n2);
            case '*' -> result = (n1*n2);
            case '/' -> {
                if (n2 == 0 ) {
                    System.out.println("Cannot divide by zero!");
                    validChoice = false;
                }
                else{
                    result = (n1/n2);
                }
            }
            case '^' -> result = Math.pow(n1,n2);
            default -> {
                System.out.println("Invalid Operation!");
                validChoice = false;
            }
        }
        System.out.println("Your answer is: " + result);
    }
}