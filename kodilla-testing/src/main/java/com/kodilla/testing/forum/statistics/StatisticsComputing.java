package com.kodilla.testing.forum.statistics;

public class StatisticsComputing {


    int numberOfUsers = 0;
    int numberOfPosts = 0;
    int numberOfComments =0;

    double averageNoOfPostsPerUser = 0;
    double averageNoOfCommentsPerUser =0;
    double averageNoOfCommentsPerPost = 0;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }
    public int getNumberOfPosts() {
        return numberOfPosts;
    }
    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNoOfPostsPerUser() {
        return averageNoOfPostsPerUser;
    }

    public double getAverageNoOfCommentsPerUser() {
        return averageNoOfCommentsPerUser;
    }

    public double getAverageNoOfCommentsPerPost() {
        return averageNoOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averageNoOfPostsPerUser = numberOfPosts / numberOfUsers;
            averageNoOfCommentsPerUser = numberOfComments / numberOfUsers;
        }
        if (numberOfPosts > 0) {
            averageNoOfCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }
    public void showStatistics() {
            System.out.println(" Number of Users: " + numberOfUsers + "\n" + " Number of posts: " + numberOfPosts + "\n"
            + "Number of comments: " + numberOfComments);
            System.out.println(" Average number of posts per User: " + averageNoOfPostsPerUser);
            System.out.println(" Average number of comments per User: " + averageNoOfCommentsPerUser);
            System.out.println(" Average number of comments per post: " + averageNoOfCommentsPerPost);
    }
}
