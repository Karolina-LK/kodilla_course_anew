package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test # " + testCounter + " executed");
    }

    @Test
    public void testCaseAddFigure() {

        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);

        //When
        Circle circle = new Circle();
        collector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeList.size());
    }

    @Test
    public void testCaseRemoveFigures() {

        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);
        Circle circle = new Circle();
        collector.addFigure(circle);
        collector.addFigure(circle);

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1, shapeList.size());

    }

    @Test
    public void testCaseRemoveFiguresNotExisting() {
        //dodałam case z sieci, przyznaje, sama nie wpadłam
        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);
        Circle circle = new Circle();

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testCaseGetFigure() {

        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);


        //When
        Circle circle = new Circle();
        collector.addFigure(circle);
        Shape result = collector.getFigure(0);


        //Then
        Assert.assertEquals(circle, result);

    }

    @Test
    public void testCaseShowFigures() {

        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);
        Circle circle = new Circle();
        collector.addFigure(circle);

        //When

        int result = collector.showFigures();

        //Then
        Assert.assertEquals(1, result);

    }
}
