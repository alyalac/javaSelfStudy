package javaStudy.Encapsulation;

public class oneset {

    private String name; // Always dapat sa isang attributes may set and get
    private int age; // dito rin kaya dapat 4

    // hindi na kasi nag add ng contructor kasi may build-in na sa set and get na
    // nilagay ko

    // setter ng name;
    void nameSet(String name) {

        this.name = name;

    }

    // getter ng name; always tandaan na walang parameters ang get
    String nameGet() {

        return this.name = name;
    }

    // setter ng age
    void setAge(int age) {

        this.age = age;
    }

    // getter ng Age
    int getAge() {

        return this.age = age;
    }

    public static void mainOutput(oneset out) {

        System.out.println("Name: " + out.nameGet());
        System.out.println("Age: " + out.getAge());

    }

    public static void main(String[] args) {

        oneset out = new oneset(); // Object

        // set and get ng Age

        out.nameSet("Andrei"); // set

        out.setAge(22);

        mainOutput(out);

    }

}