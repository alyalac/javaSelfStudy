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

        this.studentName = 
        this.studentid = studentid;
        this.english 
        this.math
        this.science
        this.computer

    }

    public static void inputGrades() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Student ID: ");
        int studentid = sc.nextInt();

        System.out.print("English: ");
        int english = sc.nextInt();

        System.out.print("Math: ");
        int math = sc.nextInt();

        System.out.print("Science: ");
        int science = sc.nextInt();

        System.out.print("Computer: ");
        int computer = sc.nextInt();

    }

    public static mainOuput() {

        System.out.println("Student Name " + this.studentName);
        System.out.println("Stduent ID " + this.studentid);
        System.out.println("English " + this.english);
        System.out.println("Math " + this.math);
        System.out.println("Science " + this.science);
        System.out.println("Computer " + this.computer);

    }

    public static void main(String[] args) {

        GradeAverageProgram ot = new GradeAverageProgram();

        inputGrades();

        ot.mainOuput();

    }

}
