import java.util.*;

public class type_of_website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String website = scan.nextLine();
            if(website.toLowerCase().contains(".com"))
                System.out.printf("%s is a Commercial website\n", website.trim());
            else if(website.toLowerCase().contains(".org"))
                System.out.printf("%s is a Organisational website\n", website.trim());
            else if(website.toLowerCase().contains(".in"))
                System.out.printf("%s is a Indian website\n", website.trim());
            else System.out.println("type of your website can not be detected");
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
