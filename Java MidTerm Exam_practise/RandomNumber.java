import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int Random = 7 + 3 * ( ( rand.nextInt(3) ));
        System.out.println(Random);
        System.out.println(Math.random());
    }
}
