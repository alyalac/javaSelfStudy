package activity;

public class SmartPhoneTwo {
    
    String brand;
    String model;
    int maxBatteryLevel;
    int batteryLevel;
    int drainAmount; 

    public SmartPhoneTwo (String brand, String model,int maxBatteryLevel, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.maxBatteryLevel = maxBatteryLevel;
        this.batteryLevel = batteryLevel;
        this.drainAmount = 0; 
    }

    public void useApp(int drainAmount) {
        this.drainAmount = drainAmount; 
        batteryLevel -= drainAmount;
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
    }

    public void outputPhone() {
        System.out.println("\nBrand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Max Battery: " + maxBatteryLevel + "%");
        System.out.println("Drain Amount: " + drainAmount + "%");
        System.out.println("Updated Battery: " + batteryLevel + "%");
    }

    public static void main(String[] args) {
        SmartPhoneTwo outKo = new SmartPhoneTwo("Vivo", "Y16",100, 100);
        SmartPhoneTwo outKoTwo = new SmartPhoneTwo("Nokia", "ARK800",100, 100);

        outKo.useApp(10);
        outKoTwo.useApp(30);

        outKo.outputPhone();
        outKoTwo.outputPhone();
    }
}