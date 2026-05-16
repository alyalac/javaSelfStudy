package javaStudy.Encapsulation;

public class oneset {

    private String name;
    private int age;

    public oneset(String name, int age) {

        this.name = name;
        this.age = age;
    }

    // setter
    void nameSet(String name) {

        this.name = name;

    }

    // getter
    String nameGet() {

        return this.name = name;
    }

    // setter
    void setAge(int age) {

        this.age = age;
    }

    // getter
    int setAge() {

        return this.age = age;
    }

    void mainOutput() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

    }

    public static void main() {

        oneset fs = new oneset("Andrei", 0);

        fs.mainOutput();

    }

}
