package javaStudy.Basics;

public class PrimitiveTypes {

    static int wholeNumber = 21; // AGE

    static float floatingNumber = 5.5833336f; // my Float height

    static char myChar = 'O'; // Blood Type

    static boolean myBool = true; // My loyalty

    static String myString = "Andrei Lance Camata"; // My name

    static byte maxValue = 127;

    static short max_Value = 32767;

    static int result = maxValue + max_Value; // Just Addition

    public static void main(String[] args) {

        System.out.println("Hello Guys, My name is " + myString);

        System.out.println("My age is " + wholeNumber + " years old");

        System.out.println("Floating Height: " + floatingNumber);

        System.out.println("My loyalty is " + myBool);

        System.out.println("Blood Type: " + myChar);

        System.out.println("Byte + Short:" + result);

    }

}