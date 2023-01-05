import java.util.*;

public class Chp4_pr3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        try{
            float salary = scan.nextFloat();
           if(salary >= 250000 && salary < 500000)
               System.out.printf("Your tax is %.2f  \n", ((5 / 100F) * salary));
           else if(salary >= 500000 && salary < 1000000)
               System.out.println("Your tax is " + (20 / 100F) * salary);
           else if (salary >= 1000000)
               System.out.println("Your tax is " + (30 / 100F) * salary);
           else System.out.println("You don't have to pay tax");
        }
        catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}
