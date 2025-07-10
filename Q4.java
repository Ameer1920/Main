package myFirstLab;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("\n--- Q4: Polymorphism in Action ---");

        AgriUnit[] units = {
            new Farmer("GiveFarmerName", 44, "Give_Place_Name"),
            new OrganicFarmer("Heera_change", 30, "Jalgaon"),
            new OrganicFarmer("Thakur_chanage", 24, "Beed")
        };

        for (AgriUnit unit : units) {
            System.out.println();
            unit.displayDetails();
        }
    }
}