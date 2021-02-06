package LambdaExpression.functionalInterfaces;


import java.util.function.Predicate;

/*
It is called functional interface because it acts as a function.
CAN HAVE ONLY ABSTRACT METHOD, but lots of default implementation.
 */
public class PredicateService implements FunctionalInterface {

    @Override
    public void execute() {

        Predicate<String> longerThanThen = (givenString) -> givenString.length() > 10;
        boolean isStringLongerThan10Symbols = longerThanThen.test("TestEilute");
        System.out.println("[PREDICATE] test string is longer than 10 symbols - " + isStringLongerThan10Symbols);

    }
}
