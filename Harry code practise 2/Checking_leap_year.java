import java.util.*;

public class Checking_leap_year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int year = scan.nextInt();
            if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
                System.out.printf("%d is leap year.", year);
            else System.out.printf("%d is not leap year", year);
        }
        catch (Exception e){
            System.out.println("Invalid input.");
        }
    }
}
