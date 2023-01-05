import java.awt.desktop.PreferencesHandler;
import java.util.Scanner;

class game{
    int number;
    int input;

    public game(){
        number = (int) Math.floor(Math.random() * ( 100  ) + 1 );
    }

    public void takeUserInput(int Input){
        input = Input;
    }

    public int isCorrectNumber(){
        return (input == number)? 1 : (input < number)? 2 : 3;
    }
}

public class cwh_vd43 {
    public static void main(String[] args) {
//        Create a class Game, which allows a user to play "Guess the Number"
//                game once. Game should have the following methods:
//        1. Constructor to generate the random number
//        2. takeUserInput() to take a user input of number
//        3. isCorrectNumber() to detect whether the number entered by the user is true
//        4. getter and setter for numberOfGuess
//        Use properties such as noOfGuesses(int), etc. to get this task done!
        Scanner scan = new Scanner (System.in);
        game obj = new game();

        int numberOfGuess = 1;
        int i = 0;

        while ( i != 1 ){
            System.out.print("Input your guess number between 1 to 100: ");
            int input = scan.nextInt();

            obj.takeUserInput( input );

            if ( obj.isCorrectNumber() == 1 ) {
                i++;
                System.out.printf("You guessed the correct number and you took %d time.\n", numberOfGuess);
            }
                else if ( obj.isCorrectNumber() == 2 ){
                    System.out.printf("The number is greater than %d\n", input);
                    numberOfGuess++;
                }
                else {
                System.out.printf("The number is less than %d\n", input);
                numberOfGuess++;
            }
        }

    }
}
