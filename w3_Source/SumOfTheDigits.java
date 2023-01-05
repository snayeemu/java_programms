public class SumOfTheDigits {
    public int sumOfDigits ( int number ){
        int sum = 0;
        while ( number > 0 ){
            int remainder = number % 10;
            number /= 10;
            sum += remainder;
        }
        return sum;
    }
}
