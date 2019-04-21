package creational_patterns.factory_pattern;

import java.util.Objects;

public class Driver {

    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getVehicle("car");
        Vehicle truck = VehicleFactory.getVehicle("truck");
        Vehicle bike = VehicleFactory.getVehicle("bike");
        Objects.requireNonNull(car).drive();
        Objects.requireNonNull(truck).drive();
        Objects.requireNonNull(bike).drive();
        Objects.requireNonNull(car).drive();
        Objects.requireNonNull(truck).drive();
        Objects.requireNonNull(bike).drive();
        Objects.requireNonNull(car).drive();
        Objects.requireNonNull(truck).drive();
        Objects.requireNonNull(bike).drive();
        Objects.requireNonNull(car).drive();
        Objects.requireNonNull(truck).drive();
        Objects.requireNonNull(bike).drive();
    }
}
