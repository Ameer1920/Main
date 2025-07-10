package myFirstLab;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("\n--- Q2: Creating Farm Objects and Calculating Index ---");

        Farm f1 = new Farm(16, "FarmName_Change", 30.8f, 19);
        Farm f2 = new Farm(17, "FarmName_Change", 59.2f, 15);

        System.out.println(f1.farmName + " - Crop Index: " + f1.calculateCropIndex());
        System.out.println(f2.farmName + " - Crop Index: " + f2.calculateCropIndex());
    }
}