import java.util.*;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int num=sc.nextInt();  //stores number of subjects

        int total=0; // stores total marks of student

        for(int i=1; i<=num; i++) {
            System.out.println("Enter marks for subject "+ i +" out of 100" );
            int marks=sc.nextInt();
            total+=marks;
        }
        double percentage= (double) total/(num*100) *100;

        System.out.println("Total marks : "+total);
        System.out.println("Average Percentage is : "+percentage+"%");

        char grade; // store grade of a student
        if(percentage>=90) {
            grade='A';
        }
        else if(percentage >= 80 && percentage < 90) {
            grade='B';
        }
        else if(percentage >= 70 && percentage < 80) {
            grade='C';
        }
        else if(percentage >= 60 && percentage < 70) {
            grade='D';
        }
        else if (percentage >= 50 && percentage < 60) {
            grade ='E';
        }
        else {
            grade='F';
        }
        System.out.println("Grade :"+ grade);
        sc.close();
    }
}