package javaStudy.Loops.practice;

import java.util.Scanner;

public class Grades {

    int english;
    int math;
    int filipino;
    int tle;
    int makabayan;
    float grades;

    public Grades(int english, int math, int filipino, int tle, int makabayan, float grades) {

        this.english = english;
        this.math = math;
        this.filipino = filipino;
        this.tle = tle;
        this.makabayan = makabayan;
        this.grades = grades;

    }

    public void inputGrades() {

        Scanner sc = new Scanner(System.in);

        System.out.print("English:");
        this.english = sc.nextInt();

        System.out.print("Math:");
        this.math = sc.nextInt();

        System.out.print("filipino:");
        this.filipino = sc.nextInt();

        System.out.print("tle:");
        this.tle = sc.nextInt();

        System.out.print("makabayan:");
        this.makabayan = sc.nextInt();

        sc.close();

    }

    float computeAverage() { // return type is float
        int[] hold = { this.english, this.math, this.filipino, this.tle, this.makabayan }; // 5
        int total = 0;

        // : - in, grade IN hold
        for (int grade : hold) {
            total += grade;
            // total = total + grade

        }
        this.grades = (float) total / hold.length; // compute average. example 433 / 5 = 86.6
        // grades

        System.out.println("Grades: " + grades);

        return this.grades; // send back the grades
    }

    public static void main(String[] args) {

        Grades in = new Grades(0, 0, 0, 0, 0, 0);

        in.inputGrades();
        in.computeAverage();

    }

}