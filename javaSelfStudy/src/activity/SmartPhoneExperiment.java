package activity;

public class SmartPhoneExperiment {

    String brand;
    int batteryLevel;
    int negative;
    int batteryLow;

    public SmartPhoneExperiment(String brand, int batteryLevel, int negative, int batteryLow) {

        this.brand = brand;
        this.batteryLevel = batteryLevel;
        this.negative = negative;
        this.batteryLow = batteryLow;

    }

    public void Output() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("BatteryLow " + this.batteryLow + "%");

    }

    public void appUse() {

        batteryLow = batteryLevel - negative;

    }

    public static void main(String[] args) {

        SmartPhoneExperiment myPhone = new SmartPhoneExperiment("Oppo", 100, 40, 0);

        myPhone.appUse();
        myPhone.Output();

    }

}
