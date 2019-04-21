package creational_patterns.factory_pattern;

public class Bike implements Vehicle {
    private int km=0;
    @Override
    public void drive() {
        km++;
        System.out.println("Bike drove : " + km + " km.");
    }
}
