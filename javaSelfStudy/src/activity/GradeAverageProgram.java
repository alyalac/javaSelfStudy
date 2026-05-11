package activity;

import java.util.Scanner;

public class GradeAverageProgram {

    String studentName;
    int studentid;
    int english;
    int math;
    int science;
    int computer;

    public GradeAverageProgram() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name: ");
        this.studentName = sc.nextLine();

        System.out.print("Student ID: ");
        this.studentid = sc.nextInt();

        System.out.print("English: ");
        this.english = sc.nextInt();

        System.out.print("Math: ");
        this.math = sc.nextInt();

        System.out.print("Science: ");
        this.science = sc.nextInt();

        System.out.print("Computer: ");
        this.computer = sc.nextInt();

    }

    public void mainOutput() {
        System.out.println("Student Grade");

        System.out.println("Student Name: " + (this.studentName));

        System.out.println("Student ID: " + (this.studentid));

        System.out.println("English: " + (this.english));

        System.out.println("Math: " + (this.math));

        System.out.println("Science: " + (this.science));

        System.out.println("Computer: " + (this.computer));

    }

    public static void main(String[] args) {

        GradeAverageProgram one = new GradeAverageProgram();

        one.mainOutput();

    }

}
