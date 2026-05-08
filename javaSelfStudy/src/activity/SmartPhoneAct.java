package activity;

public class SmartPhoneAct {

    String brand;
    String model;
    int batteryLevel;

    public SmartPhoneAct(String brand, String model, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;

    }

    public void useApp(int drainAmount) {
        batteryLevel -= drainAmount;
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }

    }

    public void outputPhone() {
        System.out.println("\nBrand : " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("batteryLevel: " + this.batteryLevel + "%");

    }

    public static void main(String[] args) {
        SmartPhoneAct outKo = new SmartPhoneAct("Vivo", "Y16", 100);

        SmartPhoneAct outKoTwo = new SmartPhoneAct("Nokia", "ARK800", 100);

        outKo.useApp(70);

        outKoTwo.useApp(90);

        outKo.outputPhone();

        outKoTwo.outputPhone();

    }
}