package com.company.figures;

public class Triangle extends Point {

    private double mSideA;
    private double mSideB;
    private double mAngleAB;

    public Triangle(double sideA, double sideB, double angleAB) {
        mSideA = sideA;
        mSideB = sideB;
        mAngleAB = angleAB;
    }

    @Override
    public double getArea() {
        return (mSideA * mSideB * Math.sin(mAngleAB * Math.PI / 180)) / 2;
    }

    @Override
    public double getPerimeter() {
        return mSideA + mSideB + calculationSideC();
    }

    @Override
    public String getDescription() {
        return "Треугольник";
    }

    private double calculationSideC() {
        return Math.sqrt(Math.pow(mSideA, 2) + Math.pow(mSideB, 2)
                - 2 * mSideA * mSideB * Math.cos(mAngleAB * Math.PI / 180));
    }
}
