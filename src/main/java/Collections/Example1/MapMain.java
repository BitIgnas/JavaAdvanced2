package Collections.Example1;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        /*
        MAP - key value pairs, no value duplicate keys.
         */
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("Stalas", "Daiktas ant kurio dedame kitus daiktus");
        dictionary.put("Kede", "ant kurios sedama");
        dictionary.put("Duris", "kurios atsidaro");

        System.out.println(dictionary.get("Duris"));

        dictionary.remove("kede");

        //Istraukiam visus irasus - EntrySet
        for (Map.Entry<String, String> stringStringEntry : dictionary.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " - " + stringStringEntry.getValue());
        }

        for (String key : dictionary.keySet()) {
            System.out.println(key);
        }

        for (String value : dictionary.values()) {
            System.out.println(value);
        }

    }
}
