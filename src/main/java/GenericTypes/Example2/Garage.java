package GenericTypes.Example2;

import java.util.List;

//Operate with object type T which extends class Vehicle
public class Garage<T extends Vehicle> {

    private List<T> diffrentTypes;

    public Garage(List<T> diffrentTypes) {
        this.diffrentTypes = diffrentTypes;
    }

    public List<T> getDiffrentTypes() {
        return diffrentTypes;
    }

    public void repairVehicle(Vehicle vehicle){
        System.out.println("Vehicle is being repaired" + vehicle.color + " " + vehicle.brand + " car");
    }
}
