package com.company.Simple;

public class SimpleClasses {
    public static void main(String[] args) {
        Pen pen = new Pen(Colors.Green);
        System.out.println(pen.getColor());

        Car car = new Car(Colors.Gray);
        System.out.println(car.toString());

        Mixer mixer = new Mixer();
        mixer.setValues(4,5);
        System.out.println(mixer.getTemp());
    }
}

