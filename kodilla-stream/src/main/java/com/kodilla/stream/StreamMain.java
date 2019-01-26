package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
       Forum theForumUser = new Forum();
        Map<String, Forum> theResultListOfUsers = theForumUser.getUserList().stream()
                //mam problem z właściwym ułożeniem filtru do płci i daty urodzenia:(
               // .filter(forumUser -> forumUser.getSex('M'))
                //i drugi problem, zawiesilam się, jak datę rozbić:(
                .filter(forumUser -> forumUser.getDateOfBirth() < 2009)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser ));

        theResultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }
}