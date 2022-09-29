package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class AviaCompany {
    private String companyName;
    private String address;

    public AviaCompany(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AviaCompany{" +
                "" + companyName + '\'' +
                ", located in " + address + '\'' +
                '}';
    }

    private Map<Class, List<Airplane>> planes = new HashMap<>();

    public void addPlane(Class type, Airplane airplane) throws AddPlaneException {
        planes.computeIfAbsent(type, k -> new ArrayList<Airplane>());
        planes.get(type).add(airplane);
        for (int i = 0; i < planes.get(type).size(); i++) {
            if(Objects.equals(planes.get(type).get(0).getName(), "")) throw new AddPlaneException("name can not be empty");
            if( planes.get(type).get(0).getPrice()==0) throw new AddPlaneException("Price can not be zero");
            if( planes.get(type).get(0).getMaxLoad()==0) throw new AddPlaneException("Max load can not be zero");
            if( planes.get(type).get(0).getflightDistance()==0) throw new AddPlaneException("fly distance can not be zero");
        }
          }

    public int sumCapacity() {
        int capacity = 0;
        for (Map.Entry<Class, List<Airplane>> entry : planes.entrySet()) {
            for (Airplane plane : entry.getValue()) {
                capacity += plane.getMaxLoad();
            }
        }
        System.out.println("Total load of all planes= " + capacity + " tonn");
        return capacity;
    }

    public int totalPassengers() {
        int countPassengers = 0;
        for (Map.Entry<Class, List<Airplane>> entry : planes.entrySet()) {
            for (Airplane plane : entry.getValue()) {
                countPassengers += plane.getCapacity();
            }
        }
        System.out.println("Total passengers capacity= " + countPassengers);
        return countPassengers;
    }

    public void flyDistanceSort() {
        List<List<Airplane>> mapValues = new ArrayList<>(planes.values());
        List<Airplane> flat = mapValues.stream().flatMap(List::stream).collect(Collectors.toList());
        flat.sort(Comparator.comparing(Airplane::getflightDistance));
        Collections.reverse(flat);
        System.out.println(flat);
    }

    public void search() throws InputMismatchException {
        int minPrice = 0, maxPrice = 0;
        double minLoad = 0, maxLoad = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Put minimal price:");
            minPrice = input.nextInt();
            System.out.println("Put maximum price:");
            maxPrice = input.nextInt();
            System.out.println("Put minimal load:");
            minLoad = input.nextDouble();
            System.out.println("Put maximum load:");
            maxLoad = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("incorrect input");
        }
        boolean count = false;
        for (Map.Entry<Class, List<Airplane>> entry : planes.entrySet()) {
            for (Airplane plane : entry.getValue()) {
                if (plane.getPrice() >= minPrice && plane.getPrice() <= maxPrice
                        && plane.getMaxLoad() >= minLoad && plane.getMaxLoad() <= maxLoad) {
                    System.out.println(plane);
                    count = true;
                }
            }
        }
        if (!count) {
            System.out.println("No one plane found, try again with other criterias");
        }
    }

    public void allPlanes() {
        System.out.println(planes.values());
    }
}
