import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int sizeOfArray = scan.nextInt();
        String[] word = new String[ sizeOfArray ];
        for( int i = 0; i < sizeOfArray; i++ )
            word[ i ] = scan.next();
        for( int i = 0; i < sizeOfArray; i++ )
        if ( word [i].length() <= 10 )
            System.out.println( word [i] );
        else {
            char firstChar = word[i].charAt(0);
            int lengthBetween = word[i].length() - 2;
            char lastChar = word[i].charAt(word[i].length() - 1);
            System.out.printf("%c%d%c\n",firstChar, lengthBetween, lastChar);
        }
    }
}
