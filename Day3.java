//import java.util.*;
//public class Day3{
//    public static void main(String[] args){
//        boolean isStudent = false;
//        boolean isSenior = false;
//        double amount = 9.99;
//        if(isStudent){
//            if(isSenior){
//                System.out.println("You got a Student discount of 10%!");
//                System.out.println("You got a Senior discount of 20%!");
//                amount *= 0.7;
//            }
//            else{
//                System.out.println("You got a Student discount of 10%!");
//                amount *= 0.9;
//            }
//        }
//        else{
//            amount *= 1;
//        }
//        System.out.printf("Your total amount is %.2f\n", amount);
//    }
//}
//
//
public class Day3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

