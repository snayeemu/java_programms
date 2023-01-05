public class cwh_vd27 {
    public static void main(String[] args) {
        int [] marks = {98, 45, 79, 99, 80};
//        float [] marks = {98.5F, 45.5F, 79.5F, 99.5F, 80};
//        String [] students = {"Harry", "Rohan", "Shubham", "Lovish"};
        // marks[5] = 96 ; - throws an error
        //        System.out.println(students[2]);
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
        System.out.println("Printing using for loop");
        // this method is called Array Traversal
        for (int i = 0; i < marks.length; i++)
            System.out.println(marks[i]);
        //for-each loop:
        System.out.println("Printing using for-each loop");
        for (int element: marks)
            System.out.println(element);
    }
}
