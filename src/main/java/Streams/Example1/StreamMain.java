package Streams.Example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        //Streams represents sequence of elements
        //Common operations of stream map, filter, foreach, etc....
        //Element in stream cannot be changed

        List<String> colors = Arrays.asList("RED", "GREEN", "BLACK", "BLUE");

        //Stream created from list
        colors.stream().sorted().findFirst().ifPresent(System.out::println);

        //Stream created from stream class

        Stream.of("Apple", "Cherry", "Banana", "Potato", "Burok")
                .filter(fruit -> fruit.startsWith("B"))
                .forEach(fruit -> System.out.println("Starts with letter B fruit: " + fruit));


        List<String> words = Stream.of("Table", "Banana", "Chair")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(words);

        //Primitive streams, for each uses consumer
        IntStream.range(1,10).forEach(number -> System.out.println(number));
    }

}
