import java.util.*;
public class CompoundInterestCalc {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int time_compound;
        double principle;
        double rate;
        int years;
        double Amount;
        System.out.print("Enter Principle amount: ");
        principle = i.nextDouble();
        System.out.print("Enter interest rate (in %): ");
        rate = i.nextDouble();
        System.out.print("Enter # of time compounded per year: ");
        time_compound = i.nextInt();
        System.out.print("Enter # of year: ");
        years = i.nextInt();
        Amount = principle*Math.pow(1+((rate/100)/time_compound), time_compound*years);
        System.out.printf("The amount of %d year is %.2f\n",years , Amount);
    }
}