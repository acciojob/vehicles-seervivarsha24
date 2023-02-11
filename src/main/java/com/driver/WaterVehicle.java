package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
    class Boat implements WaterVehicle{
        String name;
        int capacity;
        public Boat(String name,int capacity){
            this.capacity=capacity;
            this.name=name;
        }
        public String getVehicleName() {
            return name;
        }

        public int getVehicleCapacity() {
            return capacity;
        }
    }
}
