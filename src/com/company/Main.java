package com.company;

public class Main {

    public static void main(String[] args) {

        Wheel.Create();

        Car car1 = new Car("AAABBB", new SteeringWheel(true));
        car1.setBrand("Mazda");
        car1.setColor("Red");

        Car car2 = new Car("BBBDDD");


        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        System.out.println(car1.getId());

        car1.turnLeft();
        car1.turnRight();

    }
}
