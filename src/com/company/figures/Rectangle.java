package com.company.figures;

public class Rectangle extends Figure{
    private double a;
    private double b; // Радиус круга

    public double area() {
        return getA() * getB();
    }

    public double length() {
        return getA() + getB() * 2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

