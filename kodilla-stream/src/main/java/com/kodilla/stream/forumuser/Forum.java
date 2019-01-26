package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "abacka", 'F', LocalDate.of(1992, 1, 12), 200));
        theForumUserList.add(new ForumUser(2, "babacki", 'M', LocalDate.of(1996, 2, 2), 20));
        theForumUserList.add(new ForumUser(3, "cabacki", 'M', LocalDate.of(1997, 3, 13), 13));
        theForumUserList.add(new ForumUser(4, "dabacki", 'M', LocalDate.of(1996, 4, 10), 2));
        theForumUserList.add(new ForumUser(5, "ebacka", 'F', LocalDate.of(1995, 5, 0), 250));
        theForumUserList.add(new ForumUser(6, "fabacki", 'M', LocalDate.of(1994, 6, 16), 67));
        theForumUserList.add(new ForumUser(7, "gabacki", 'M', LocalDate.of(1993, 7, 0), 17));
        theForumUserList.add(new ForumUser(8, "habacki", 'M', LocalDate.of(1998, 8, 18), 58));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }

}
