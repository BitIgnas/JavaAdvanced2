package LambdaExpression.functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionService implements FunctionalInterface {


    @Override
    public void execute() {
        //Accepts one argument, produces one result
        //First argument input of type T
        //Second argument

        Function<String, Integer> lengthFunction = (givenString) -> givenString.length();
        System.out.println("[FUNCTION 1] length of labadiena is " + lengthFunction.apply("labadiena"));


        Function<Integer, Integer> multiplierFunction = givenNumber -> givenNumber * 2;
        Integer multiplyFunctionResult = multiplierFunction.apply(2);
        System.out.println("[FUNCTION 2] Number 2 multiplied by 2 is " + multiplyFunctionResult);

        BiFunction<Integer, Integer, Integer> biFunction= (a, b) -> a*b*5;
        System.out.println("[FUNCTION 3] number 1*5*5 = " + biFunction.apply(1, 5));

    }
}
