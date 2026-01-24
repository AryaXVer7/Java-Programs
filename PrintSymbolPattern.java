import java.util.*;

public class PrintSymbolPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfColumns;
        int numOfRows;
        char symbol = ' ';
        System.out.print("Enter number of columns: ");
        numOfColumns = input.nextInt();
        System.out.print("Enter number of rows: ");
        numOfRows = input.nextInt();
        System.out.print("Enter your sysmbol: ");
        symbol = input.next().charAt(0);
        for (int i = 1; i <= numOfRows ; i++){
            for (int j = 1; j <= numOfColumns ; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}