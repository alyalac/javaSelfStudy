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

    float checkStatus() {

        {
            if (this.average > 100) { // Above, If the average is more than 100, it is not a valid grade
                System.out.println("Invalid Grades");

                // If the average is 98 or more, AND 100 or less, it falls in this range
            } else if (this.average >= 98 && average <= 100) {
                System.out.println("With Highest Honors");

                // If the average is 95 or more, AND 97.99 or less, it falls in this range (f
                // means it is a decimal number)
            } else if (this.average >= 95 && average <= 97.99f) {
                System.out.println("With Honors");

                // If the average is 90 or more, AND 94.99 or less, it falls in this range
            } else if (this.average >= 90 && average <= 94.99f) {
                System.out.println("PASSED");

            } else {
                System.out.println("Failed");
            }
        }

        return this.average; // Send back the average value so it can be used outside this method

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

        // Create a new student with default values (no name yet, all grades are 0)
        GradeAverageProgram in = new GradeAverageProgram("Unknown", 0, 0, 0, 0, 0, 0);

        in.inputInfo(); // Ask the user to type in the student name and grades

        in.finalAverage(); // Calculate the average based on the grades that were entered

        in.mainOutput(); // Show the student name, grades, and average on the screen

        in.checkStatus(); // Check the average and show if the student Passed, Failed, or got Honors
    }

}
