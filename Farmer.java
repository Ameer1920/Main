package myFirstLab;
public class Farmer extends AgriUnit {
    protected String name;
    protected int age;
    protected String location;

    public Farmer(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("👨‍🌾 Farmer Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Village: " + location);
    }
}