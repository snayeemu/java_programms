public class TwoDArray {
    private int [] [] array;

    public TwoDArray( int [] [] array ){
        this.array = array;
    }

    public int sum(){
        int sum = 0;
        for ( int [] elements : array ){
            for ( int elements1 : elements )
                sum += elements1;
        }
        return sum;
    }
}
