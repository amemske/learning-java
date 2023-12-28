package com.uopeople;

import java.util.ArrayList;

/**
 * MotorVehicle
 */
public interface MotorVehicle {
    int setNumberOfWheels(int motorcycleNumberOfWheels);
    void getNumberOfWheels();
    void setMotorcycleType(ArrayList<String> motorcycleType);
    void getMotorcycleType();
    
}