package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AviaCompany turkishAirlines = new AviaCompany("Tukish Airlines", "Istambul, sq. Ambady, b8");
        System.out.println(turkishAirlines);

        turkishAirlines.addPlane(Boing.class, new Boing("777", 20000000, 280, 25.5, 11000));
        turkishAirlines.addPlane(Boing.class, new Boing("738", 11000000, 120, 12, 7000));
        turkishAirlines.addPlane(Boing.class, new Boing("747", 15000000, 180, 15.2, 8000));
        turkishAirlines.addPlane(Boing.class, new Boing("738", 11000000, 120, 12, 7000));
        turkishAirlines.addPlane(Boing.class, new Boing("725", 9000000, 110, 11.4, 5000));
        turkishAirlines.addPlane(Airbus.class, new Airbus("A380", 5000000, 290, 26, 12000));
        turkishAirlines.addPlane(Airbus.class, new Airbus("A360", 4000000, 275, 24.2, 11000));
        turkishAirlines.addPlane(Airbus.class, new Airbus("A300", 2000000, 250, 21, 9000));
        turkishAirlines.addPlane(Airbus.class, new Airbus("A320", 3500000, 260, 22, 10500));
        turkishAirlines.addPlane(Airbus.class, new Airbus("A290", 2000000, 250, 21, 8000));
        turkishAirlines.addPlane(Beluga.class, new Beluga("ST", 55000000, 95, 15, 10, 15000, 10));
        turkishAirlines.addPlane(Beluga.class, new Beluga("XL", 75000000, 120, 20, 15, 15000, 20));
        turkishAirlines.addPlane(Beluga.class, new Beluga("LCF", 35000000, 90, 10, 8, 10000, 7));
        turkishAirlines.addPlane(Antonov.class, new Antonov("AN-225", 25000000, 120, 20, 12, 15000, 18));
        turkishAirlines.addPlane(Antonov.class, new Antonov("AN-215", 22000000, 110, 18, 10, 12000, 22));


        int choice = 8;
        while (choice != 0) {
            choice = menu();
            switch (choice) {
                case 1:
                    turkishAirlines.allPlanes();
                    break;
                case 2:
                    turkishAirlines.sumCapacity();
                    break;
                case 3:
                    turkishAirlines.totalPassengers();
                    break;
                case 4:
                    turkishAirlines.flyDistanceSort();
                    break;
                case 5:
                    turkishAirlines.search();
                    break;
                case 0:
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("incorrect enter, please choose correct number");
                    break;
            }
        }
    }

    public static int menu() {
        int selection = 9;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose our options");
        System.out.println("-------------------------\n");
        System.out.println("1 - show all planes");
        System.out.println("2 - Calculate total load of all planes");
        System.out.println("3 - Check total passengers capacity");
        System.out.println("4 - Sort planes by maximum distance");
        System.out.println("5 - Find planes by price and loads");
        System.out.println("0 - Quit");
        try {
            selection = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("incorrect enter, please choose correct number");
        }
        return selection;
    }
}
