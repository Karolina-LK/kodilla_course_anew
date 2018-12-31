package com.kodilla.testing.shape;

public class Square implements Shape {

    @Override
    public String getShapeName(){

        return "Square";
    }

    public double getField(){
        return 4.0;
    }
}
