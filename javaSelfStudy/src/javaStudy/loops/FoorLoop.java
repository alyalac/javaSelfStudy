package javaStudy.loops;

// int 1 = 0, start at 0

// i < 5, keep going while i less than 5
// i++ , add 1 to  i every time
// i, is just variable name

public class FoorLoop {

    public static void countDown() {

        for (int count = 0; count < 11; count++) {
            System.out.println(count);

            // 10
        }
    }

    public static void evenNumbers() {

        for (int count = 0; count <= 10; count = count + 2) { // add every 2 steps
            System.out.println(count);
            // 0 + 2 = 2, 2 + 2 = 4, 4 + 2 = 6, 6 + 2 = 8, 8 + 2 = 10 (last print), 10 + 2 =
            // 12 → 12 <= 10? NO → STOP

        }
    }

    public static void sumOfNumbers() {

        int sum = 0; // i, starts at whatever you set it to!
        for (int i = 1; i <= 5; i++) { // i starts at 1 and counts up to 5 one step at a time
            sum = sum + i; // take the current value of sum, add i to it, save it back to sum
        }
        System.out.println("Sum is " + sum); // prints 15 because 1 + 2 + 3 + 4 + 5 = 15

        // 15

    }

    public static void main(String[] args) {

        countDown();
        evenNumbers();
        sumOfNumbers();

    }

}
