import java.util.*;
public class Circle {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;
        System.out.print("Enter radius: ");
        radius = i.nextDouble();
        circumference = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius, 2);
        volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("Circumference is " + circumference);
        System.out.println("Area is " + area);
        System.out.println("Volume is " + volume);
    }
}