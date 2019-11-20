package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    // instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " for " + durationInHours + "h.");

        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;

        //same result as the statement above
       //traveledDistance += distance;

        System.out.println("Total traveled distance: " + traveledDistance);

        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel level: " + fuelLevel);

        return distance;
    }

    // Date creationDate = new Date(2019. 30, 11);
    // LocalDate createdDate = LocalDate.now().minusWeeks(2);

}