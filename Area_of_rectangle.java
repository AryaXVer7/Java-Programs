import java.util.Scanner;
public class Area_of_rectangle{
    public static void main(String[] args){
        double length = 0;
        double width = 0;
        double area = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = scanner.nextDouble(); //already defined
        System.out.print("Enter the width: ");
        width = scanner.nextDouble(); //already defined
        area = length * width; //already defined
        System.out.print("The area of the rectangle is: " + area + " sq.units");
        scanner.close();
    }
}