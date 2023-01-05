public class cwh_vd34 {
    static int factorial(int n){
        // factorial(n) = n * n - 1 * ....1
        // factorial (5) = 5 * 4 * 3 * 2 * 1
        // factorial(n) = n * factorial(n-1)
        if (n == 0)
            return 1;
        else return n * factorial ( n - 1 );
    }

    public static void main(String[] args) {
        System.out.println("The value of factorial 4 is " + factorial(4));
    }
}
