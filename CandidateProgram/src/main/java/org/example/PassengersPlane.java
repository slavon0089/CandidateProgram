package org.example;

import java.util.List;
import java.util.Map;

public abstract class PassengersPlane extends Airplane implements Activities {
    String name;
    int price;
    int capacity;
    double maxLoad;

    public PassengersPlane(String name, int price, int capacity, double maxLoad, int flightDistance) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.maxLoad = maxLoad;
        this.flightDistance = flightDistance;
    }

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

    public int getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(int flightDistance) {
        this.flightDistance = flightDistance;
    }

    @Override
    public void hyperSpeed() {
        System.out.println("can fly on hyper speed");
    }

    @Override
    public String toString() {
        return "PassengerPlane {" +
                "name='" + name + '\'' +
                ", cost=" + price + " euro" +
                ", capacity=" + capacity + "person" +
                ", maxLoad=" + maxLoad + "tonn" +
                ", flightDistance=" + flightDistance + " km" +
                "}\n";
    }
}
