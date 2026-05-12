package javaStudy.Loops;
// count++, count = count + 1 — adds 1

// count--, count = count - 1 — subtracts 1

public class WhileLoop {

    public static void countDown() {
        int countdown = 10;
        while (countdown > 0) {
            System.out.println("I LOVE YOU: " + countdown);
            countdown--;

        }

    }

    public static void falseCondition() {

        int numbers = 10;

        while (numbers < 5) {
            System.out.println("This will never be printed");
            numbers++;

        }

    }

    public static void main(String[] args) {

        // countDown();
        falseCondition();
    }

}
