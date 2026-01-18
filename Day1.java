/*public class Day1{
    public static void main(String[] args){
        //Day1
        System.out.println("Hello, Java!!"); //next line 'println'
        System.out.print("Hello, Java21!!");
    }
}*/

// public class Day1{
//     public static void main(String[] args){
//         int age = 18;  //initialized
//         double price = 9.99;
//         char currency = '$';
//         boolean isOnline = true;
//         //System.out.println("You are " + age) ;
//         //System.out.println("The price is $" + price);
//         //System.out.println("The currency is " + currency);
//         /*if (!isOnline){  //not isOnline?
//             System.out.println("You are Online!");
//         }
//         else{
//             System.out.println("You are not Online!");
//         }*/

//         String name = "Apex";
//         String last_name = "ARY";
//         System.out.print("Your name is " + name + last_name + ", " + "your age is " + age + ", " + "your price is " + currency + price + " and " + "you are not Online");

//     }
// }


//Taking Input using Scanner

import java.util.Scanner;
public class Day1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //To end the newline error btw. int and string.
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //taking input along with spaces 'nextLine()'.
        System.out.print("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.print("Hello " + name + ", your age is " + age + ", your cgpa is " + cgpa + ", Student: " + isStudent);
        scanner.close();
    }
}