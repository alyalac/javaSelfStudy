//Smaller type > Larger type
//byte > short > char > int > long > float > double

package javaStudy.Basics;

public class WideningCasting {

    public static void main(String[] Args) {

        int quantity = 3;
        double price = 10.50;

        double result = quantity * price;

        System.out.println("Quantity x Price = " + result);

        // Java automatically changes 'quantity' to 3.0 behind the scenes
        // so it can safely multiply 3.0 * 10.50 = 31.5

    }

}
