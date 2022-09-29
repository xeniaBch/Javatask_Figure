package Lesson_comparators.ObjectComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User( "John", 14);
        User user2 = new User( "Marle", 34);
        User user3 = new User( "Steve", 87);
        User user4 = new User( "Alex", 2);

        List <User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        Collections.sort(users, new UserNameComparator());
        System.out.println(users);

        Collections.sort(users, new UserIdComparator());
        System.out.println(users);
    }
}
