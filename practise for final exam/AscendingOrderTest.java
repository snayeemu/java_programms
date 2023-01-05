import java.util.Scanner;

public class AscendingOrderTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.print("Enter size of your array: ");
        int size = scan.nextInt();
        int [] array = new int[ size ];

        System.out.println("Enter elements of your array: ");
        for ( int i = 0; i < size; i++ )
            array[i] = scan.nextInt();

        AscendingOrder as = new AscendingOrder( array );

        System.out.println("Array before sorting: ");
        as.displayArray();

        System.out.println();
        as.sortAscending();
        System.out.println("After sorting the array is: ");
        as.displayArray();
    }
}
