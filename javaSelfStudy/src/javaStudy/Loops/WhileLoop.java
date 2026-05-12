package javaStudy.Loops;

public class WhileLoop {

    public static void countDown() {
        int countdown = 10;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;

            // count++ // count = count + 1 — adds 1
            // count = count - 1 — subtracts 1
        }
        System.out.println("Happy Birthday");
    }

    public static void main(String[] args) {

        countDown();
    }

}
