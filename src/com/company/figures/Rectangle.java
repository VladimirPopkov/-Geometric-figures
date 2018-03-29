package com.company.figures;

public class Rectangle extends Point {

    private double mSideA;
    private double mSideB;

    public Rectangle(double sideA, double sideB) {
        mSideA = sideA;
        mSideB = sideB;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return mSideA * mSideB;
    }

    @Override
    public double getPerimeter() {
        return (mSideA * 2) + (mSideB * 2);
    }

    @Override
    public String getDescription() {
        return "Прямоугольник";
    }
}
