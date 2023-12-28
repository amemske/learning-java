package com.uopeople;

import java.util.ArrayList;

public interface TruckVehicle {
    void setCargoCapacity(int truckCargoCapacity);
    void getCargoCapacity();
    void setTransmissionType(ArrayList<String> truckTransmissionType);
    void getTransmissionType();

}
