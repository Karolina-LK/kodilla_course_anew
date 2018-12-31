package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public int figuresCounter = 0;

    ArrayList<Shape> shapeList = new ArrayList <Shape>();
    //nie wiem, czy mam ww zmieniać, skoro program zakresla jako błędne

    public ShapeCollector(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapeList.size()) {
            shape = shapeList.get(n);
        }
        return shape;

    }

    public int showFigures() {
        for (Shape showedFigure : shapeList) {
            System.out.println("Figure: " + showedFigure.getShapeName() + " Field: " + showedFigure.getField() + " m2");
            figuresCounter++;
        }
        return figuresCounter;

    }

}
