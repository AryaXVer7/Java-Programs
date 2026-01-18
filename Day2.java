// import java.util.*;
// public class Day2{
//     public static void main(String[] args){
//         Random a = new Random();
//         int number;
//         number = a.nextInt(1,10);
//         System.out.println("Random output: " + number);
//     }
// }


// import java.util.*;
// public class Day2{
//     public static void main(String[] args){
//         Random a = new Random();
//         boolean isHeads;
//         isHeads = a.nextBoolean();
//         if (isHeads){
//             System.out.println("HEADS!");
//         }
//         else{
//             System.out.println("TAIL!");
//         }
//     }
// }


import java.util.*;
public class Day2{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int a;
        int b;
        double c;
        System.out.print("Enter a: ");
        a = i.nextInt();
        System.out.print("Enter b: ");
        b = i.nextInt();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The Hypotenuse: " + c);
    }
}


