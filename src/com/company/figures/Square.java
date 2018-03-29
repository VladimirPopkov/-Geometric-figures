package com.company.figures;

public class Square extends Rectangle{

    private double mSide;

    public Square(double side){
        mSide = side;
    }

    @Override
    public double getArea() {
        return Math.pow(mSide, 2);
    }

    @Override
    public double getPerimeter() {
        return mSide*4;
    }

    @Override
    public String getDescription() {
        return "Квадрат";
    }
}
