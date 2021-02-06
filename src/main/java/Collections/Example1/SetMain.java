package Collections.Example1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        /*
        No duplicates allowed.
        Return elements in non predictable order.
         */
        Set<String> computerNames = new HashSet<>();
        computerNames.add("Dell");
        computerNames.add("Lenova");
        computerNames.add("Asus");
        computerNames.add("Apple");
        computerNames.add("Apple");
        System.out.println(computerNames);

        if(computerNames.contains("Asus")){
            System.out.println("There is Asus pc in list");
        }


    }
}
