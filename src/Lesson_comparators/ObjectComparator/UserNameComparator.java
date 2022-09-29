package Lesson_comparators.ObjectComparator;

import java.util.Comparator;

public class UserNameComparator implements Comparator <User> {
    @Override
    public int compare(User u1, User u2) {
        if (u1.getName().compareTo(u2.getName()) > 0) {
            return 1;
        } else if (u1.getName().compareTo(u2.getName()) < 0) {
            return -1;

        }
        return 0;
    }
}
