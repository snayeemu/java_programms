import java.util.Scanner;

public class TwoDArraySumTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter the size of row: ");
        int row = scan.nextInt();
        System.out.print("Enter the size of column: ");
        int column = scan.nextInt();
        int [] [] array = new int[row][column];

        for ( int i = 0; i < row; i++){
            System.out.printf("Enter row number %d: \n", i+1 );
            for ( int j = 0; j < column; j++ )
                array [i][j] = scan.nextInt();
        }

        TwoDArray td =new TwoDArray( array );
        int sum = td.sum();
        System.out.printf("Sum of this two d array is: %d \n", sum );
    }
}
