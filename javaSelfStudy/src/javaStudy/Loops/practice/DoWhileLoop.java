//Do: The program enters the block and runs the code immediately
//While: After the block finishes, the program evaluates a boolean condition
//Repeat or Exit: if the condition is true, it jumps back to the do. if false, it moves on.

package javaStudy.Loops.practice;

public class DoWhileLoop {

    public static void doWhileLoop() {

        int counts = 10;
        do {
            System.out.println(counts);
            counts--;
        } while (counts >= 0);

    }

    public static void main(String[] args) {

        doWhileLoop();
    }
}
