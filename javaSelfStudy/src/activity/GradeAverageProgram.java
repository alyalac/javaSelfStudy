// I struggled here with arrays and loops,
// but I know the basics — not yet fully mastered.
// It's okay, allowing yourself to be a beginner is fine.

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
    float average;

    // Constructor
    public GradeAverageProgram(String studentName, int studentid, int english, int math, int science, int computer,
            float average) {

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

    public float finalAverage() {

        // Store all grades in an array so we can loop through them easily
        // ex: english=90, math=85, science=88, computer=92
        int[] grades = { this.english, this.math, this.science, this.computer };

        // This will hold the sum of all grades, starts at 0
        // ex: total = 90 + 85 + 88 + 92 = 355
        int total = 0; // same as: total = total + grade

        // Loop through each grade and add it to total
        for (int grade : grades) {
            total += grade;

        }

        // grades.length = 4 (auto-counts how many items in the array)
        // (float) 355 / 4 = 88.75
        // (float) → tells Java to treat the division as float
        // because int / int = int (no decimal)
        // but float / int = float (with decimal!)
        this.average = (float) total / grades.length;

        this.average = (float) total / grades.length;
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
