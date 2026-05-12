package javaStudy.loops;

// int 1 = 0, start at 0

// i < 5, keep going while i less than 5
// i++ , add 1 to  i every time
// i, is just variable name

public class FoorLoop {

    public static void countTen() {

        for (int count = 0; count < 11; count++) {
            System.out.println(count);

            // 10
        }
    }

    public static void evenNumbers() {
        for (int count = 0; count <= 10; count = count + 2) { // add every 2 steps
            System.out.println(count);

        }
    }

    public static void main(String[] args) {

        // countTen();
        evenNumbers();

    }

}
