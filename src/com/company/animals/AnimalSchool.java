package com.company.animals;

import java.util.Random;

public class AnimalSchool {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.run();
        Squirrel squirrel = new Squirrel();
        squirrel.climb();
    }
}

interface Running {  // Printing, Visible
    void run();
}

interface Swimming {  // Interface vs abstract class
    void swim();
}

interface Climbing {  // Interface vs abstract class
    void climb();
}

class Rabbit implements Running, Swimming {

    @Override
    public void run() {
        System.out.println("Rabbit runs");
    }

    @Override
    public void swim() {
        System.out.println("Rabbit swims");
    }
}

class Squirrel implements Running, Climbing {

    @Override
    public void run() {
        System.out.println("Squirrel runs");
    }

    @Override
    public void climb() {
        System.out.println("Squirrel climbs");
    }
}