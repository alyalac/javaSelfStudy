package javaStudy.Loops;
// count++, count = count + 1 — adds 1

// count--, count = count - 1 — subtracts 1

public class WhileLoop {

    public static void countDown() {
        int countdown = 10; // start — before the loop
        while (countdown > 0) { // condition

            System.out.println("I LOVE YOU: " + countdown);
            countdown--; // STEP — inside the loop

        }

    }

    public static void falseCondition() {

        int numbers = 10;

        while (numbers < 5) {
            System.out.println("This will never be printed");
            numbers++;

        }

    }

    public static void experimentWhileAndCondition() {

        int numbers = 0;

        while (numbers <= 11) {

            if (numbers >= 1 && numbers <= 4) {
                System.out.println(numbers + " - Low");

            } else if (numbers >= 5 && numbers <= 10) {
                System.out.println(numbers + " - High");
            } else if (numbers >= 11) {
                System.out.println(numbers + " - TO MUCH");
            }
            numbers++;

        }

    }

    public static void main(String[] args) {

        // countDown();
        // falseCondition();
        experimentWhileAndCondition();

    }

}
