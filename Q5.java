package myFirstLab;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("\n--- Q5: Static Fields and Initialization ---");

        Farm f3 = new Farm(99, "Rainy Plains", 61.9f, 24);

        System.out.println("Total Farms Created: " + Farm.totalFarms);
    }
}