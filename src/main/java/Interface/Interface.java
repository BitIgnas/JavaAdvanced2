package Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Interface {
    public static void main(String[] args) {

        Addable adding = (int num1, int num2 ) -> (num1 + num2);
        System.out.println(adding.add(10, 10));

        Sayable saySmt = () -> {
            System.out.println("Test");
        };

        saySmt.say();

        Names name = (String name1, String name2, String name3) -> {
            String userNames = "Your names " + name1 + " " + name2 + " " + name3;
            return userNames;
        };

        System.out.println(name.sayNames("Vienas", "Two", "Three"));

        Predicate<Integer> testing = num1 -> (num1 > 18);
        System.out.println(testing.test(20));

        Predicate<String> testingString = word -> (word.equalsIgnoreCase("word"));
        System.out.println(testingString.test("word"));

        Predicate<Integer> chechIfCorrectAge = Interface::checkAge;
        System.out.println(chechIfCorrectAge.test(20));

        Function<Float, Double> mathPi = (givenNumber) -> (givenNumber * 3.14);
        System.out.println(mathPi.apply((float)2));

        Function<String, Boolean> wordComparison = (givenWord) -> (givenWord.equalsIgnoreCase("text"));
        System.out.println(wordComparison.apply("TEXT"));

        Supplier<Double> mathPiInDouble = () -> 3.14;
        System.out.println(mathPiInDouble.get());

        Supplier<String> sampleText = () -> "This is sample text";
        System.out.println(sampleText.get());



    }

    public static boolean checkAge(int age){
        if(age >= 18)
            return true;
            else return false;

    }

}


interface Addable{
    int add(int num1, int num2);

}

    interface Sayable{
    void say();

}

interface Names{
    String sayNames(String name1, String name2, String name3);
}
