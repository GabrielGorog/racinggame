package org.fasttrackit;

public class JokerVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with " + speed + " for " + durationInHours + "h.");

        double distance = 2 * speed * durationInHours;

        setTraveledDistance(getTraveledDistance() + distance);

        System.out.println("Cheating! haha..");
        return distance;
    }

    // co-variant return type
    // access cannot be more restrictive than in the parent class
    @Override
    public JokerVehicle clone() {
        return new JokerVehicle();

    }

    public void fly() {
        System.out.println("Flying!!!");
    }
}
