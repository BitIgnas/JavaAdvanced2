package Collections.Example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        /*
        List - ordered collections of elements.
        Elements can be accessed by their index.
         */

        List<String> animals = new ArrayList<>();
        animals.add("Rhino");
        animals.add("Dog");
        animals.add("Pig");
        animals.add("Deer");
        animals.add("Ant");

        System.out.println(animals);
        System.out.println("After sorting");
        Collections.sort(animals);
        System.out.println(animals);

        Collections.sort(animals, Collections.reverseOrder());
        System.out.println("After reverse sorting");
        System.out.println(animals);

        List<Integer> numbersOfList = Arrays.asList(8, 2, 3, 4, 6, 9);
        System.out.println("Max value: " + Collections.max(numbersOfList));
        System.out.println("Lowest value:" + Collections.min(numbersOfList));

    }
}
