import java.util.*;

public class Passed_or_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] subjects = new int[3];
        int total_marks = 0;
        final int total_subjects = 3;
        try {
            for (int i = 0; i < 3; i++) {
                System.out.printf("Enter marks of subject no %d\n", (i + 1) );
                subjects[i] = scan.nextInt();
                total_marks = total_marks + subjects[i];
            }
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
        int total_percentage = total_marks / total_subjects;
        if(subjects[0] >= 33 && subjects[1] >= 33 && subjects[2] >= 33 && total_percentage >= 40)
            System.out.println("You passed.");
        else System.out.println("You failed.");
    }
}
