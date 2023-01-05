public class cwh_vd28 {
    public static void main(String[] args) {
        //multi dimensional array is an array of array
        int []marks; // a 1D array
        int [][] flats; // a 2d array
        flats = new int [2][3];
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;

        for (int i = 0 ; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++)
                System.out.print(flats[i][j] + " ");
            System.out.println();
        } // for loop ended here.
        // enhanced for loop
        System.out.println("By enhanced for loop:");
        for (int[] element: flats) {
            for (int elements : element)
                System.out.printf("%d ", elements);
            System.out.println();
        } // enhanced for loop ended.
    }
}
