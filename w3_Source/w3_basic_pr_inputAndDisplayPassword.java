import java.util.Scanner;

public class w3_basic_pr_inputAndDisplayPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Input your Password: ");
        String password = scan.nextLine();
        System.out.printf("Your password is %s\n", password);
    }
}
