package com.company.figures;

public class Circle extends Point {

    private double mR;

    public Circle(double R) {
        mR = R;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(mR, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * mR;
    }

    @Override
    public String getDescription() {
        return "Круг";
    }
}
