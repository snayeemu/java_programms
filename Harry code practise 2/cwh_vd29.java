import java.util.Scanner;

public class cwh_vd29 {
    public static void main(String[] args) {
        // problem no 1:
//        float [] array = {1.5F, 2, 3, 4.6F, 5};
//        float sum = 0.0F;
//        for (float element: array)
//            sum += element;
//        System.out.printf("Sum of the array is %.2f", sum);
        // problem no 2:
//        int [] array = {1, 2, 3, 4, 5};
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Input the number: ");
//        int givenNumber = scan.nextInt();
//        boolean hasNumber = false;
//        for (int i = 0; i < array.length; i++) {
//            hasNumber = (array[i] == givenNumber);
//            if (hasNumber)
//                break;
//        } // loop ended.
//        System.out.printf("%d is %s", givenNumber, (hasNumber)? "in the array" : "not presented in the array.");
        // problem no 3
//        int [] physicsMarks = {80, 70, 75, 65, 85, 90};
//        int sum = 0;
//        for (int mark: physicsMarks)
//            sum += mark;
//        int average = sum / physicsMarks.length;
//        System.out.printf("Average marks of all students is %d \n", average);
        // problem no 4:
//        int[][] matrix1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] matrix2 = {{8, 4, 3},
//                {9, 5, 4}};
//        int sumMatrix1 = 0;
//        int sumMatrix2 = 0;
//        for (int[] element: matrix1)
//            for(int elements: element)
//                sumMatrix1 += elements;
//        for (int[] element: matrix2)
//            for(int elements: element)
//                sumMatrix2 += elements;
//        int total = sumMatrix1 + sumMatrix2;
//        System.out.printf("Total of matrix1 and matrix2 is %d\n", total);
        // problem no 5:
//        int [] array = {1, 2, 3, 4, 5};
//                int [] temp = new int [array.length];
//        System.arraycopy(array, 0, temp, 0, array.length); // copying array to temp.
//        int j = temp.length - 1;
//        for (int i = 0; i < array.length; i++)
//            array[i] = temp[j--];
//        System.out.println("After reversing the array is: ");
//        for (int element: array)
//            System.out.printf("%d ", element);
        //problem no 6:
//        int [] array = {1, 2, 3, 4, 1};
//        int maximum = array[0];
//        for (int element: array)
//            maximum = Math.max(maximum, element); // finding maximum
////
//        System.out.printf("Maximum element of the array is %d \n", maximum);
        // problem no 7;
//        int [] array = {10, 2, 3, 4, 5};
//        int minimum = array[0];
//        for(int element: array)
//            minimum = Math.min(minimum, element);
//        System.out.printf("The minimum element of the array is %d \n", minimum);
        // problem no 8:
        int [] array = new int [5];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 5 int of the array: ");
        for (int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();

        boolean sorted = false;

        for (int i = 0; i < array.length - 1; i++) {
            sorted = (array[i] < array[i + 1]);
            if (!sorted)
                break;;
        }
        if (!sorted)
        for (int i = 0; i < array.length-1; i++){
            sorted = (array[i] > array[i + 1]);
            if(!sorted)
                break;
        }

        System.out.printf("The array is %s", (sorted)?"sorted":"not sorted");


    }
}