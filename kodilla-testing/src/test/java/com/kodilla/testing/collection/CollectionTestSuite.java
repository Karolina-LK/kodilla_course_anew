package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        ArrayList<Integer> emptyList = OddNumbersExterminator.exterminate(new ArrayList<>());

        Assert.assertTrue(emptyList.isEmpty());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> even = new ArrayList<Integer>();
        even.add(1);
        even.add(2);
        even.add(3);
        even.add(4);
        even.add(5);
        even.add(6);
        even.add(7);
        even.add(8);

        ArrayList<Integer> evenList = OddNumbersExterminator.exterminate(even);

        Assert.assertEquals(4, evenList.size());
        assertResultNumbers(evenList);
        //czy assertResultNumbers nie powtarza troche opcji assert equals, tylko ładniej, tj przy wiekszych
        // zbiorach bedzie lepiej funkcjonowac?
    }

    private void assertResultNumbers (ArrayList < Integer > evenList) {
        for (Integer i : evenList) {
            Assert.assertEquals(0, i % 2);
        }
    }
}