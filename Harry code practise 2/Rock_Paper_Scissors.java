import java.util.*;
import java.lang.Math;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("Lets play Rack-Paper-Scissors with Nayeem");
        Scanner scan = new Scanner(System.in);
        try {
            int i = 0, yourScore = 0, myScore = 0;
            while (i < 5) {
                i++;
                System.out.println("Enter 1 for 'rock', 2 for 'paper', 3 for 'scissors'");
                int yourNumber = scan.nextInt();
                int nayeem = (int) (Math.random() * (3 - 1 + 1) + 1);
                String user = (yourNumber == 1) ? "rock" : (yourNumber == 2) ? "paper" : (yourNumber == 3) ? "scissors" : "";
                String computer = (nayeem == 1) ? "rock" : (nayeem == 2) ? "paper" : (nayeem == 3) ? "scissors" : "";
                if (user.equalsIgnoreCase(computer)) {
                    System.out.printf("You took %s and Nayeem took %s, this round is draw. \n", user, computer);
                    yourScore++;
                    myScore++;
                } else if (user.equals("rock") && computer.equals("paper")) {
                    System.out.printf("You took %s and Nayeem took %s, Nayeem won this round.\n", user, computer);
                    myScore++;
                } else if (user.equals("rock") && computer.equals("scissors")) {
                    System.out.printf("You took %s and Nayeem took %s, you won this round.\n", user, computer);
                    yourScore++;
                } else if (user.equals("paper") && computer.equals("rock")) {
                    System.out.printf("You took %s and Nayeem took %s, you won this round.\n", user, computer);
                    yourScore++;
                } else if (user.equals("paper") && computer.equals("scissors")) {
                    System.out.printf("You took %s and Nayeem took %s, Nayeem won this round.\n", user, computer);
                    myScore++;
                } else if (user.equals("scissors") && computer.equals("paper")) {
                    System.out.printf("You took %s and Nayeem took %s, you won this round.\n", user, computer);
                    yourScore++;
                } else if (user.equals("scissors") && computer.equals("rock")) {
                    System.out.printf("You took %s and Nayeem took %s, Nayeem won this round.\n", user, computer);
                    myScore++;
                } else System.out.println("Invalid input.");
            }
                System.out.printf("Your final score is %d and Nayeem's final score is %d, finally  %s\n ", yourScore, myScore,
                        (yourScore == myScore)? "this match is draw": (yourScore > myScore)? "you won the match": (yourScore < myScore)?
                        "Nayeem won the match":"");

        }
        catch (Exception e){
            System.out.println("Invalid input format, try again.");
        }
    }
}
