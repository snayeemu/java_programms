import java.util.Random;

class random_number_practise {
    public static void main(String[] args) {
        int random;
        Random rand = new Random();
        random = rand.nextInt(5 - 3 + 1) + 3;
        System.out.println(random);
    }
}
