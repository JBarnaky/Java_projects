import java.util.InputMismatchException;
import java.util.Scanner;

public class task5
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int n = scan.nextInt();
            System.out.println(month(n));
        }
        catch (InputMismatchException e){
            System.out.println("Not a number");
        }
    }
    public static String month(int n){
        String[] month = {"","January","February","March","April","May","June","July","August","September","October",
                "November","December"};
        if(n > 0 && n<month.length)
        {
            return month[n];
        }
        return "Month not found";
    }
}