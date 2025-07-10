package myFirstLab;

public class Farm extends AgriUnit {
    private int farmId;
    public String farmName;
    private float rainfall;
    private int fertilizerUsed;

    public static int totalFarms;

    static {
        totalFarms = 0;
        System.out.println("Static block: totalFarms initialized to 0");
    }

    public Farm(int farmId, String farmName, float rainfall, int fertilizerUsed) {
        this.farmId = farmId;
        this.farmName = farmName;
        this.rainfall = rainfall;
        this.fertilizerUsed = fertilizerUsed;
        totalFarms++;
        System.out.println("✅ Farm created: " + farmName + " | Total Farms: " + totalFarms);
    }

    public int calculateCropIndex() {
        return (fertilizerUsed * 2) + (int) rainfall;
    }

    public void displayDetails() {
        System.out.println("Farm ID: " + farmId);
        System.out.println("Name: " + farmName);
        System.out.println("Rainfall: " + rainfall + " mm");
        System.out.println("Fertilizer: " + fertilizerUsed + " kg");
        System.out.println("Crop Index: " + calculateCropIndex());
    }
}