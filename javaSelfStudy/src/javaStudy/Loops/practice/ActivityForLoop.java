package javaStudy.Loops.practice;

import java.util.Scanner;

public class ActivityForLoop {

    public static void levelOne() {

        System.out.println("Level One");

        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }

    }

    public static void levelTwo() { // oddNumbers

        for (int count = 1; count <= 10; count = count + 2) {
            System.out.println(count);
        }

    }

    // Step 1: Where does it start? → int count = 1 (starts at 1)
    // Step 2: When does it stop? → count <= 100 (stops when count goes past 100)
    // Step 3: How does it move? → count++ (adds 1 every step)
    // Step 4: What happens inside? → sum = sum + count (collects the total)

    public static void levelThree() {

        int sum = 0;
        for (int count = 1; count <= 100; count++) {
            sum = sum + count;

        }
        System.out.println("Sum" + sum);
    }

    public static void main(String[] args) {

        levelOne();
        levelTwo();
        levelThree();

    }

}
