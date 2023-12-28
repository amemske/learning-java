package com.uopeople;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // Create objects for each Vehicle
        Car car = new Car("Toyota", "Hilux",2016, 4, new ArrayList<>(Arrays.asList("Petrol")));

        // Display information about each Car
        car.make();
        car.model();
        car.getCarDoors();
        car.yearOfManufacture();
        
        // Set car data
        car.setCarDoors(5);
        car.setfuelType(new ArrayList<>(Arrays.asList("diesel")));

        // get car data
        car.getCarDoors();
        car.getfuelType();

        // Create objects for each Motorcycle
        Motorcycle motorcycle = new Motorcycle("Suzuki", "GSX-S1000",2020, 2, new ArrayList<>(Arrays.asList("Sport")));

        // Display information about each Motorcycle
        motorcycle.make();
        motorcycle.model();
        motorcycle.getNumberOfWheels();
        
        // Set Motorcycle data
        motorcycle.setNumberOfWheels(3);
        motorcycle.setMotorcycleType(new ArrayList<>(Arrays.asList("Cruiser")));

        // get Motorcycle data
        motorcycle.getMotorcycleType();
        motorcycle.getNumberOfWheels();

        // Create objects for each Truck
        Truck truck = new Truck("Isuzu", "FRR",2022, 600, new ArrayList<>(Arrays.asList("manual")));

        // Display information about each Truck
        truck.make();
        truck.model();
        truck.yearOfManufacture();
        
        // Set Truck data
        truck.setCargoCapacity(4500);
        truck.setTransmissionType(new ArrayList<>(Arrays.asList("manual")));

        // get Truck data
        truck.getCargoCapacity();
        truck.getTransmissionType();

    }
}
