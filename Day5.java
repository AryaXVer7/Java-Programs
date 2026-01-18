//import java.util.*;
//
//public class Day5{
//    public static void main(String[] args){
//        //Ternary operator
//        // variable = (condition) ? ifTrue : ifFalse;
//        int score = 70;
//        String failorpas = (score >= 70) ? "PASS" : "FAIL";
//        System.out.println(failorpas);
//    }
//}


import java.awt.desktop.SystemEventListener;
import java.util.*;

//public class Day5{
//    public static void main(String[] args){
//        //Ternary operator
//        // variable = (condition) ? ifTrue : ifFalse;
//        int num = 16;
//        String EvenOrOdd = (num % 2 == 0) ? "Even" : "Odd";
//        System.out.println(EvenOrOdd);
//    }
//}


import java.util.*;

//public class Day5{
//    public static void main(String[] args){
//        // Enhanced switch
//        String day = "Chutday";
//        switch(day){
//            case "Monday", "Tuesday","Wednesday","Thursday", "Friday" -> System.out.println("Weekday");
//            case "Saturday", "Sunday"-> System.out.println("Weekend");
//            default -> System.out.println("Not a day!");
//        }
//    }
//}


//public class Day5{
//    public static void main(String[] args){
//        // && AND, || OR, ! NOT
//        double temp = 40;
//        if (temp <= 30 && temp >= 0){
//            System.out.println("AND Operator");
//            System.out.println("FUCK NIGG!");
//        }
//        else{
//            System.out.println("HOEEEEEE!");
//        }
//
//        double temp1 = 40;
//        if (temp1 <= 30 || temp1 >= 0){
//            System.out.println("OR Operator");
//            System.out.println("AGAIN FUCK NIGG!");
//        }
//        else{
//            System.out.println("WHOREEEE!");
//        }
//
//        double temp2 = 40;
//        if (temp2 != 30 ){
//            System.out.println("NOT   Operator");
//            System.out.println("AGAIN WE FUCK NIGG!");
//        }
//        else{
//            System.out.println("AGAIN WHOREEEE!");
//        }
//    }
//}


//public class Day5{
//    public static void main(String[] args){
//        //while loop
//        Scanner i = new Scanner(System.in);
//        String name = "";
//        while (name.isEmpty()){
//            System.out.print("Please enter your name: ");
//            name = i.nextLine();
//        }
//        System.out.println("Hello " + name);
//    }
//}


//public class Day5{
//    public static void main(String[] args){
//        Scanner i = new Scanner(System.in);
//         String response = "";
//         while (!response.equals("Q")){
//             System.out.println("You are in a loop!");
//             System.out.print("Press Q to exit: ");
//             response = i.next().toUpperCase();
//         }
//         System.out.println("You are out of loop!");
//    }
//}



public class Day5{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int age;
        do {
            System.out.println("Age can't be negative!");
            System.out.print("Enter your age: ");
            age = i.nextInt();
        }while (age < 0);
        System.out.println("Your are " + age + " years old.");
    }
}