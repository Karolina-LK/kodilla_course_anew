package com.kodilla.testing.forum.statistics;


import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StaticticsTestSuite {

    public static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Test Case: begin");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("Test Case: end");
    }


    @Before
    public void beforeEveryTest() {

        testCounter++;
        System.out.println("Beginning the test no: " + testCounter);
    }
    @After
    public void afterEveryTest() {
        System.out.println("Test no: "+ testCounter+ " completed");
    }

    @Test
    public void testCalculateAdvStatisticsAllZeros(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputing computing = new StatisticsComputing();

        //When
        computing.calculateAdvStatistics(statisticsMock);
        computing.showStatistics();

        //Then
        Assert.assertEquals(0, computing.getNumberOfComments());
        Assert.assertEquals(0, computing.getNumberOfPosts());
        Assert.assertEquals(0, computing.getNumberOfUsers());
        //zapis poniżej podpowiedziany, nie jestem pewna, czy rozumiem końcowke wersu

        Assert.assertEquals(0, computing.getAverageNoOfCommentsPerPost(), 0);
        Assert.assertEquals(0, computing.getAverageNoOfCommentsPerUser(), 0);
        Assert.assertEquals(0, computing.getAverageNoOfPostsPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputing computing = new StatisticsComputing();

        ArrayList<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userNames.add("testUser");
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        computing.calculateAdvStatistics(statisticsMock);
        computing.showStatistics();

        //Then
        Assert.assertEquals(0, computing.getNumberOfComments());
        Assert.assertEquals(0, computing.getNumberOfPosts());
        Assert.assertEquals(100, computing.getNumberOfUsers());
        Assert.assertEquals(0, computing.getAverageNoOfCommentsPerPost(), 0);
        Assert.assertEquals(0, computing.getAverageNoOfCommentsPerUser(), 0);
        Assert.assertEquals(0, computing.getAverageNoOfPostsPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsHundredUsersAndThousandPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputing computing = new StatisticsComputing();

        ArrayList<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userNames.add("testUser");
        }
        //czy poniżej mogłabym wpisać thenReturn(100)?  i wtedy bez tworzenia listy?
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        computing.calculateAdvStatistics(statisticsMock);
        computing.showStatistics();

        //Then
        Assert.assertEquals(0, computing.getNumberOfComments());
        Assert.assertEquals(1000, computing.getNumberOfPosts());
        Assert.assertEquals(100, computing.getNumberOfUsers());
        Assert.assertEquals(0, computing.getAverageNoOfCommentsPerPost(), 0);
        Assert.assertEquals(0, computing.getAverageNoOfCommentsPerUser(), 0);
        Assert.assertEquals(10, computing.getAverageNoOfPostsPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputing computing = new StatisticsComputing();

        ArrayList<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userNames.add("testUser");
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        computing.calculateAdvStatistics(statisticsMock);
        computing.showStatistics();

        //Then
        Assert.assertEquals(100, computing.getNumberOfComments());
        Assert.assertEquals(1000, computing.getNumberOfPosts());
        Assert.assertEquals(100, computing.getNumberOfUsers());
        Assert.assertTrue(computing.averageNoOfCommentsPerPost < 1);
        Assert.assertEquals(1, computing.getAverageNoOfCommentsPerUser(), 0);
        Assert.assertEquals(10, computing.getAverageNoOfPostsPerUser(), 0);

    }

    @Test
    public void testCalculateAdvStatisticsLessPostsThanComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputing computing = new StatisticsComputing();

        ArrayList<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userNames.add("testUser");
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        //When
        computing.calculateAdvStatistics(statisticsMock);
        computing.showStatistics();

        //Then
        Assert.assertEquals(1000, computing.getNumberOfComments());
        Assert.assertEquals(100, computing.getNumberOfPosts());
        Assert.assertEquals(100, computing.getNumberOfUsers());
        Assert.assertTrue(computing.averageNoOfCommentsPerPost > 1);
        Assert.assertEquals(10, computing.getAverageNoOfCommentsPerUser(), 0);
        Assert.assertEquals(1, computing.getAverageNoOfPostsPerUser(), 0);

    }
}
