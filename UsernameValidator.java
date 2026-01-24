import java.util.*;
public class UsernameValidator {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        String username;
        System.out.print("Enter your username for validation: ");
        username = i.nextLine();
        if (username.length() < 4 || username.length() > 12 ){
            System.out.println("Username must be between 4-12 characters.");
        }
        else if (username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or dashes.");
        }
        else{
            System.out.println("Username is valid!");
        }
    }
}