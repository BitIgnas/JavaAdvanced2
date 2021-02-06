package Collections.Example1;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello");

        Set<String> list = new HashSet<>();
        list.add("Hello");

        Map<String, Integer> map = new HashMap<>();
        map.put("Jonaitis", 86432342);

        //List

        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(5);
        listOfIntegers.add(10);
        listOfIntegers.add(15);
        listOfIntegers.add(20);

        for(Integer singleIter : listOfIntegers){
            System.out.println(singleIter);
        }

        listOfIntegers.forEach((s) -> System.out.println(s));

        //Set

        Set<String> names = new HashSet<>();
        names.add("Dario");
        names.add("Mario");
        names.add("Luigi");

        System.out.println(names);

        //Map

        Map<Integer, Integer> mapList = new HashMap<>();
        mapList.put(5, 2);
        mapList.put(1, 2);
        mapList.put(2, 3);

        Map<Integer, List<String>> phoneBook = new HashMap<>();
        List<String> namesOfPeople = Arrays.asList("Tomas", "Darius", "Povilas");
        List<String> namesOfPeople2 = Arrays.asList("Samanta", "Gabriele", "Dominyka");

        phoneBook.put(1, namesOfPeople);
        phoneBook.put(2, namesOfPeople2);
        phoneBook.put(3, Arrays.asList("Bill", "Tom"));

        System.out.println(namesOfPeople.get(2)); // array index to take
        System.out.println(namesOfPeople2.get(0)); // array index to take

        for (List<String> listOfPeople : phoneBook.values()) {
            for (String listOfPerson : listOfPeople) {
                System.out.println(listOfPerson);
            }
        }


        List<String> listOfSongs = new ArrayList<>();
        listOfSongs.add("Phonk");
        listOfSongs.add("Rap");
        listOfSongs.add("Despacito");

        for (String listOfSong : listOfSongs) {
            if(listOfSong.contains("Phonk")){
                System.out.println("Turi gera muzikos skoni");
                break;
            } else {
                System.out.println("Ne");
                break;
            }
        }

        Map <Integer, List<String>> listOfPeople = new HashMap<>();

        int[] numeration = new int[]{1, 2, 3, 4 ,5};
        List<String> listOfGames = Arrays.asList("Far cry", "Gta", "Cities skylines");
        List<String> listOfMovies = Arrays.asList("Tenet", "Fast and furious", "Star wars");

        listOfPeople.put(numeration[0], listOfGames);
        listOfPeople.put(numeration[1], listOfMovies);
        listOfPeople.put(3, Arrays.asList("People that dont like movies and games"));

        System.out.println(listOfPeople.get(1));
        System.out.println(listOfPeople.get(3));


    }
}
