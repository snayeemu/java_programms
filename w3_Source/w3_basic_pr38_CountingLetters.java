import java.util.Scanner;

public class w3_basic_pr38_CountingLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter a string: ");
        String string = scan.nextLine();
        Count count1 = new Count();
        count1.count( string );
    }
}

class Count{
    public void count( String string ){
        char [] charArray = string.toCharArray();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;
        for ( char element: charArray ) {
            if (Character.isLetter(element))
                letters++;
            else if (Character.isSpaceChar(element))
                spaces++;
            else if (Character.isDigit(element))
                numbers++;
            else others++;
        }
        System.out.println("Thi string is: " + string );
        System.out.println("Letters: "  + letters);
        System.out.println("Spaces: "  + spaces);
        System.out.println("numbers: "  + numbers);
        System.out.println("Others: "  + others);

    }
}