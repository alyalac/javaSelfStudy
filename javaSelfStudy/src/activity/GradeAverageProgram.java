package activity;

import java.util.Scanner;

public class GradeAverageProgram {

    // Attributes
    String studentName;
    int studentid;
    int english;
    int math;
    int science;
    int computer;
    int average;

    // Constructor
    public GradeAverageProgram(String studentName, int studentid, int english, int math, int science, int computer,
            int average) {

        this.studentName = studentName;

        this.studentid = studentid;
        this.english = english;
        this.math = math;
        this.science = science;
        this.computer = computer;
        this.average = average;
    }

    public void inputInfo() {

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

    public int finalAverage() {
        int[] grades = { this.english, this.math, this.science, this.computer };
        int total = 0;

        for (int grade : grades) {
            total += grade;

        }

        this.average = total / grades.length;
        return this.average; // final answer
    }

    public void mainOutput() {

        System.out.println("-----------------------------------");

        System.out.println("\nStudent Grade");

        System.out.println("Student Name: " + this.studentName);

        System.out.println("Student ID: " + this.studentid);

        System.out.println("\nEnglish: " + this.english);

        System.out.println("Math: " + this.math);

        System.out.println("Science: " + this.science);

        System.out.println("Computer: " + this.computer);

        System.out.println("-----------------------------------");

        System.out.println("GPA: " + this.average);

    }

    public static void main(String[] args) {

        GradeAverageProgram in = new GradeAverageProgram("Unknown", 0, 0, 0, 0, 0, 0);

        in.inputInfo();

        in.finalAverage();

        in.mainOutput();
    }

}
