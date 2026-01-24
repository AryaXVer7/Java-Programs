import java.util.*;
public class WeightConversion {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int Choice;
        double lbs;
        double kgs;
        System.out.println("Weight Conversion Program");
        System.out.println("1: Kgs to lbs");
        System.out.println("2: lbs to kgs");
        System.out.print("Enter the choice (1 or 2): ");
        Choice = i.nextInt();
        if(Choice==1){
            System.out.print("Enter weight in kgs: ");
            kgs = i.nextDouble();
            System.out.println("Weight in lbs: " + (kgs*2.20462));
        }
        else if(Choice==2){
            System.out.print("Enter weight in lbs: ");
            lbs = i.nextDouble();
            System.out.println("Weight in kgs: " + (lbs/2.20462));
        }
        else{
            System.out.println("Choose a valid option!.");
        }
    }
}