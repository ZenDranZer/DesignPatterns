package creational_patterns.factory_pattern;

public class Truck implements Vehicle {
    private int km=0;
    @Override
    public void drive() {
        km++;
        System.out.println("Truck drove : " + km + " km.");
    }
}
