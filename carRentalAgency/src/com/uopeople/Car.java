package com.uopeople;

import java.util.ArrayList;

public class Car implements Vehicle, CarVehicle {
    private String carMake;
    private String carModel;
    private int carYearOfManufacture;
    private int carNumberOfDoors;
    private ArrayList<String> carFuelType = new ArrayList<>();

    public Car(String carMake, String carModel, int carYearOfManufacture, int carNumberOfDoors, ArrayList <String> carFuelType){
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYearOfManufacture = carYearOfManufacture;
        this.carNumberOfDoors = carNumberOfDoors;
        this.carFuelType = carFuelType;
    }

    @Override
    public void make(){
        System.out.println("The car's make is " + carMake);
    }

    @Override
    public void model(){
        System.out.println("The car's model is " + carModel);
    }
    @Override
    public void yearOfManufacture(){
        System.out.println("The car's year of manufacture is " + carYearOfManufacture);
    }

    @Override
    public int setCarDoors(int carNumberOfDoors){
        return this.carNumberOfDoors = carNumberOfDoors;
    }

    @Override
    public void getCarDoors(){
        System.out.println("The car's has " + carNumberOfDoors + " doors");
    }

    @Override
    public void setfuelType(ArrayList<String> carFuelType){
         this.carFuelType = carFuelType;
    }
    @Override
    public void getfuelType(){
        System.out.println("The car's uses " + carFuelType );
    }

  
}
