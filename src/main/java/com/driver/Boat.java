package com.driver;


   public class Boat implements WaterVehicle{
        private String name;
        private int capacity;
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

        public void setName(String name) {
            this.name = name;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }
    }
