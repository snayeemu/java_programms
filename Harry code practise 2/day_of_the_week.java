import java.util.*;

public class day_of_the_week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter the day of this week as an Integer: ");
            int day = scan.nextInt();
            switch(day){
                case 1 -> System.out.println("Today is Monday");
                case 2 -> System.out.println("Today is Tuesday");
                case 3 -> System.out.println("Today is Wednesday");
                case 4 -> System.out.println("Today is Thursday");
                case 5 -> System.out.println("Today is Friday");
                case 6 -> System.out.println("Today is Saturday");
                case 7 -> System.out.println("Today is Sunday");
                default -> System.out.println("Invalid input");
            }
        }
        catch(Exception e){
            System.out.println("Invalid input format");
        }
    }
}
