package com.kodilla.testing.shape;

public  class Circle implements Shape {

    @Override
    //nie bardzo wiem, czemu mi dopisało override tu (w cw na interfejsy jako zywo nic)

    public String getShapeName(){
       final String name = "This is a circle";
        //to z podpowiedzi InteliJ, nie wiem, czy tak może być */
        return name;
    }

    public double getField(){
        return 12.56;
    }


}
