package creational_patterns.factory_pattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicle){
        if(vehicle.equalsIgnoreCase("car"))
            return new Car();
        else if(vehicle.equalsIgnoreCase("truck"))
            return new Truck();
        else if(vehicle.equalsIgnoreCase("bike"))
            return new Bike();
        else
            return null;
    }

}
