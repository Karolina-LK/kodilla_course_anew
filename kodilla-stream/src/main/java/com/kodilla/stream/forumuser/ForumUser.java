package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser (final String userId, final String userName, final char sex, final LocalDate dateOfBirth,
                      final int numberOfPosts ) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId: " + userId +
                ", userName: '" + userName + '\n' +
                ", sex: " + sex +
                ", dateOfBirth: " + dateOfBirth +
                ", number of posts: " + numberOfPosts +
                '}';
    }
}
