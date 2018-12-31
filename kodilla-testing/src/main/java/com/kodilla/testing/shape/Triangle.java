package com.kodilla.testing.shape;

public class Triangle implements Shape {

    @Override
    public String getShapeName(){

        return "Triangle";
    }

    public double getField(){
        return 2.0;
    }
}
