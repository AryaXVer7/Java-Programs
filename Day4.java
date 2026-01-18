//Email_Slicer

import java.util.*;
public class Day4{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        String email;
        System.out.print("Enter your email: ");
        email = i.nextLine();
        if(email.contains("@")){
            System.out.println("Your username: " + email.substring(0, email.indexOf("@")));
            System.out.println("Your domain: " + email.substring(email.lastIndexOf("@")+1));
        }
        else{
            System.out.println("Your emain must conatain '@'.");
        }
    }
}