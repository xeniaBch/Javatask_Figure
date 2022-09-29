package Lesson_comparators.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(3);
        numbers.add(6);
        numbers.add(2);
        numbers.add(0);
        numbers.add(7);
        Collections.sort(numbers, new MyComparator());
        System.out.println(numbers);


        List<String> strings = new ArrayList();
        strings.add("Orange");
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Kiwi");
        strings.add("Grape");
        Collections.sort (strings, new StringComparator());
        System.out.println(strings);

        List<String> lstrings = new ArrayList();
        lstrings.add("aaaaa");
        lstrings.add("aa");
        lstrings.add("aaa");
        lstrings.add("a");
        lstrings.add("aaaaaa");
        Collections.sort (lstrings, new LengthComparator());
        System.out.println(lstrings);

    }



}
