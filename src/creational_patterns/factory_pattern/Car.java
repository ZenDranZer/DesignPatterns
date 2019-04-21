package creational_patterns.factory_pattern;

public class Car implements Vehicle {
    private int km = 0;

    @Override
    public void drive() {
        km++;
        System.out.println("Car drove : " + km + " km.");
    }
}
