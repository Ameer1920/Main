package myFirstLab;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("\n--- Q3: Abstraction and Encapsulation ---");

        Farm farm = new Farm(140, "GiveFarm_Name", 51.3f, 22);
        Farmer farmer = new Farmer("GiverFarmer_name", 35, "Give_Place_Coimbatore");

        System.out.println("🌿 Farm Details:");
        farm.displayDetails();

        System.out.println("\n👨‍🌾 Farmer Details:");
        farmer.displayDetails();
    }
}