package GenericTypes.Example2;

import java.util.Arrays;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {
        BMW bmw = new BMW("Black", "318i");
        Audi audi = new Audi("White", "a6");

        List<Vehicle> cars = Arrays.asList(new BMW("Grey", "520"), audi);

        Garage garage = new Garage(cars);
        for (Vehicle car : cars) {
            garage.repairVehicle(car);
        }
    }
}

