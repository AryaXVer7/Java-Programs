package Projects;

import java.util.*;

public class BankingProgram {
    static Scanner i = new Scanner(System.in);
    public static void main(String[] args){
        double balance = 0;
        boolean isRunning = true;
        int choice = 0;
        while (isRunning == true){
            System.out.print("*******************************\n Bandking Program\n*******************************\n1.Bank Balance\n2.Deposite\n3.Withdraw\n4.Exit");
            System.out.print("Enter a choice from(1-4): ");
            choice = i.nextInt();
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposite();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Input.");

            }
        }
        System.out.print("Have a Nice Day!");
    }
    static void showBalance(double balance){
        System.out.printf("$%f\n", balance);
    }
    static double deposite() {
        System.out.print("Enter your amount: ");
        double amount = i.nextDouble();
        if (amount < 0){
            System.out.print("Amount cannot be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double balance){
        System.out.print("Enter amount you want to withdraw: ");
        double amount = i.nextDouble();
        if (amount < 0){
            System.out.print("Amount can not be negative!");
            return 0;
        }
        else if (amount > balance){
            System.out.println("Insufficient Balance!");
            return 0;
        }
        else{
            return amount;
        }
    }
}

