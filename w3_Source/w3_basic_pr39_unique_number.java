public class w3_basic_pr39_unique_number {
    public static void main(String[] args) {
        int counter = 0;
        for( int i=1; i <= 4; i++ )
            for (int j = 1; j <= 4; j++ )
            for (int k = 1; k <= 4; k++ )
            for (int z = 1; z <= 4; z++ )
            if ( i != j && i != k && i != z && j != k && j != z && k != z ){
                System.out.printf("%d%d%d%d\n", i, j, k, z);
            counter++;
            }
        System.out.println("Total number " + counter);

    }
}
