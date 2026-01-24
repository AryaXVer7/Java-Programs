import java.util.*;

public class TemperatureConverter{
    public static void main(String[] args){
        double converted;
        String choice;
        double temp;
        Scanner t = new Scanner(System.in);
        System.out.println("Welcome to temperature converter!");
        System.out.print("Please select F for C to F or C for F to C: ");
        choice = t.nextLine().toUpperCase();
        System.out.print("Enter temperature: ");
        temp = t.nextDouble();
        converted = (choice.equals("F")) ? ((temp*9.0/5.0) + 32) : ((temp - 32)*5/9);
        System.out.println("Your converted temperature: " + converted + " " + choice);
    }
}