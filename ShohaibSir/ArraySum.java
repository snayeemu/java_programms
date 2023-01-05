public class ArraySum {
    public static void main(String[] args) {
        int [] array = { 1, 2, 4, 4 };
        int sum = 0;
        for ( int element : array)
            sum += element;
        System.out.println(sum);
    }
}
