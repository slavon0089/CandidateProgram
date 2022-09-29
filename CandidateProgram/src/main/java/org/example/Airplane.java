package org.example;


public abstract class Airplane {
    String name;
    public int price;
    int capacity;
    double maxLoad;
    int flightDistance;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public double getMaxLoad() {
        return maxLoad;
    }
    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }
    public int getflightDistance() {
        return flightDistance;
    }
    public void setflightDistance(int flightRange) {
        this.flightDistance = flightRange;
    }

}
