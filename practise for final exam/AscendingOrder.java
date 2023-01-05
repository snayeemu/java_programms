public class AscendingOrder {
    private int [] array;
    public AscendingOrder( int [] array ){
        this.array = array;
    }

    public void sortAscending (){
        int temp;
        for ( int i = 0; i < array.length; i++ )
        for ( int j = i + 1; j < array.length; j++ )
            if ( array[i] > array[j] ){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
        }
    }

    public void displayArray(){
        for ( int elements: array )
            System.out.printf("%4d", elements);
        System.out.println();
    }
}
