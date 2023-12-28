package com.uopeople;

import java.util.ArrayList;

public class Truck implements Vehicle, TruckVehicle {

    private String truckMake;
    private String truckModel;
    private int truckYearOfManufacture;
    private int truckCargoCapacity;
    private ArrayList<String> truckTransmissionType = new ArrayList<>();

    public Truck(String truckMake, String truckModel, int truckYearOfManufacture, int truckCargoCapacity,
            ArrayList<String> truckTransmissionType) {
        this.truckMake = truckMake;
        this.truckModel = truckModel;
        this.truckYearOfManufacture = truckYearOfManufacture;
        this.truckCargoCapacity = truckCargoCapacity;
        this.truckTransmissionType = truckTransmissionType;
    }

    @Override
    public void make() {
        System.out.println("The truck's make is " + truckMake);
    }

    @Override
    public void model() {
        System.out.println("The truck's model is " + truckModel);
    }

    @Override
    public void yearOfManufacture() {
        System.out.println("The truck's year of manufacture is " + truckYearOfManufacture);
    }

    @Override
    public void setCargoCapacity(int truckCargoCapacity) {
         this.truckCargoCapacity = truckCargoCapacity;
    }

    @Override
    public void getCargoCapacity() {
        System.out.println("The truck's has a capacity of  " + truckCargoCapacity + " tons");
    }

    @Override
    public void setTransmissionType(ArrayList<String> truckTransmissionType) {
       this.truckTransmissionType = truckTransmissionType;
    }
    @Override
    public void getTransmissionType() {
        System.out.println("The truck has  " + truckTransmissionType + " transmission");
    }
}
