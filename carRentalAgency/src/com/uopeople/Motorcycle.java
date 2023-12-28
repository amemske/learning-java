package com.uopeople;

import java.util.ArrayList;

public class Motorcycle implements Vehicle, MotorVehicle {
    private String motorcycleMake;
    private String motorcycleModel;
    private int motorcycleYearOfManufacture;
    private int motorcycleNumberOfWheels;
    private ArrayList<String> motorcycleType = new ArrayList<>();

    public Motorcycle(String motorcycleMake, String motorcycleModel, int motorcycleYearOfManufacture,
            int motorcycleNumberOfWheels, ArrayList<String> motorcycleType) {
        this.motorcycleMake = motorcycleMake;
        this.motorcycleModel = motorcycleModel;
        this.motorcycleYearOfManufacture = motorcycleYearOfManufacture;
        this.motorcycleNumberOfWheels = motorcycleNumberOfWheels;
        this.motorcycleType = motorcycleType;
    }

    @Override
    public void make() {
        System.out.println("The motorcycle's make is " + motorcycleMake);
    }

    @Override
    public void model() {
        System.out.println("The motorcycle's model is " + motorcycleModel);
    }

    @Override
    public void yearOfManufacture() {
        System.out.println("The motorcycle's year of manufacture is " + motorcycleYearOfManufacture);
    }

    @Override
    public int setNumberOfWheels(int motorcycleNumberOfWheels) {
        return this.motorcycleNumberOfWheels = motorcycleNumberOfWheels;
    }

    @Override
    public void getNumberOfWheels() {
        System.out.println("The motorcycle's has " + motorcycleNumberOfWheels + " wheels");
    }

    @Override
    public void setMotorcycleType(ArrayList<String> motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

     @Override
    public void getMotorcycleType() {
        System.out.println("The motorcycle's is of type " + motorcycleType);
    }

}
