package myFirstLab;
public class OrganicFarmer extends Farmer {
    public OrganicFarmer(String name, int age, String location) {
        super(name, age, location);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("✅ Uses organic methods 🌿");
    }
}