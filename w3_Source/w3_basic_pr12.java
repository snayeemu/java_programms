import java.util.*;

public class w3_basic_pr12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float [] numbers = new float[3];
        float sum = 0;
        for (int i = 0; i < 3; i++) {
            numbers[i] = scan.nextFloat();
            sum = sum + numbers[i];
        }
        float average = sum / 3;
        System.out.println("Average is " + average);
    }
}
