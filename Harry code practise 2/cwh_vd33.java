public class cwh_vd33 {
    // Varargs
    static int sum(int ...arr){
        // available as int [] arr;
        int result = 0;
        for (int element: arr)
            result += element;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to Varargs Tutorial");
        System.out.println("Sum of nothing: " + sum());
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 9, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));
    }
}
