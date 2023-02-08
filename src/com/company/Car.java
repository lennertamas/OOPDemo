package com.company;

import java.util.ArrayList;

public class Car {

    private String brand = "";
    private String color = "";
    private String id = "";
    private SteeringWheel sw = null;
    public ArrayList<Wheel> wheels = new ArrayList<Wheel>();

    public String getId() {
        return id;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String param, SteeringWheel strwh)
    {
        id = param;
        sw = strwh;
    }

    public Car(String param)
    {
        id = param;
        sw = new SteeringWheel(true);

        for (int i = 0; i<4; i++)
        {
            wheels.add(new Wheel());
        }
        System.out.println(wheels.size());
    }

    public void turnLeft()
    {
        //name = "ZZZ";
        System.out.println("Car is turning left");
    }

    public void turnRight()
    {
        //name = "AAA";
        System.out.println("Car is turning right");
    }
}
