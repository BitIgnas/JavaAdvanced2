package LambdaExpression.functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {

        FunctionalInterface functionalInterface = new PredicateService();
        functionalInterface.execute();

        Predicate<String> namesWithAPredicate = name -> name.startsWith("A");

        List<String> names = Arrays.asList("Mike", "Bill", "David", "Clair", "Aaron");
        List<String> namesStartWithA = names.stream()
                         .filter(name -> name.startsWith("A")).collect(Collectors.toList());


        System.out.println("[PREDICATE 2] names start with A letter " + namesStartWithA);

        functionalInterface = new SupplierService();
        functionalInterface.execute();

        functionalInterface = new FunctionService();
        functionalInterface.execute();

    }
}
