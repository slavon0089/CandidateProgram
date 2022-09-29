package org.example;

public abstract class CargoPlane extends Airplane{

    String name;
    int price;
    double maxLoad;
    int maxCargoLength;
    int maxCargoWidth;
    int boxCount;

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

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxCargoLength() {
        return maxCargoLength;
    }

    public void setMaxCargoLength(int maxCargoLength) {
        this.maxCargoLength = maxCargoLength;
    }

    public int getMaxCargoWidth() {
        return maxCargoWidth;
    }

    public void setMaxCargoWidth(int maxCargoWidth) {
        this.maxCargoWidth = maxCargoWidth;
    }

    public void setFlightDistance(int flightDistance) {
        this.flightDistance = flightDistance;
    }

    public int getBoxCount() {
        return boxCount;
    }

    public void setBoxCount(int boxCount) {
        this.boxCount = boxCount;
    }

    public CargoPlane(String name, int price, double maxLoad, int maxCargoLength, int maxCargoWidth, int flightDistance, int boxCount) {
        this.name = name;
        this.price = price;
        this.maxLoad = maxLoad;
        this.maxCargoLength = maxCargoLength;
        this.maxCargoWidth = maxCargoWidth;
        this.flightDistance = flightDistance;
        this.boxCount = boxCount;
    }

    @Override
    public String toString() {
        return "CargoPlane:{" +
                "name='" + name + '\'' +
                ", cost=" + price + " euro"+
                ", maxLoad=" + maxLoad +
                ", maxCargoLength=" + maxCargoLength +
                ", maxCargoWidth=" + maxCargoWidth +
                ", flightDistance=" + flightDistance +
                ", contains=" + boxCount + "boxes" +
                "}\n";
    }
}
