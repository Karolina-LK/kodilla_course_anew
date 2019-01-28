package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given
        //Create counties

        Country country1 = new Country("A_Country","1111111111");
        Country country2 = new Country("B_Country","1111111111");
        Country country3 = new Country("C_Country","1111111111");
        Country country4 = new Country("AA_Country","2222222222");
        Country country5 = new Country("BB_Country","2222222222");
        Country country6 = new Country("CC_Country","2222222222");
        Country country7 = new Country("AAA_Country","3333333333");
        Country country8 = new Country("BBB_Country","3333333333");
        Country country9 = new Country("CCC_Country","3333333333");

        //Create continents

        Continent a_continent = new Continent("A_Continent");
        a_continent.addCoutry(country1);
        a_continent.addCoutry(country2);
        a_continent.addCoutry(country3);

        Continent aa_continent = new Continent("AA_Continent");
        aa_continent.addCoutry(country4);
        aa_continent.addCoutry(country5);
        aa_continent.addCoutry(country6);

        Continent aaa_continent = new Continent("AAA_Continent");
        aaa_continent.addCoutry(country7);
        aaa_continent.addCoutry(country8);
        aaa_continent.addCoutry(country9);

        //Create world

        World world = new World();
        world.addContinents(a_continent);
        world.addContinents(aa_continent);
        world.addContinents(aaa_continent);

        //When

        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("19999999998");

        //Then
        Assert.assertEquals(expected,result);

    }
}
