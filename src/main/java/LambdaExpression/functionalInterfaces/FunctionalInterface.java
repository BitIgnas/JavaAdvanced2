package LambdaExpression.functionalInterfaces;

//Functional interface is treated as SAM interface(single abstract method);

/*
Functional Interface

1.Predicate[Input type] - accepts ONE argument and return boolean result; Predicate<String> - input type string
2.Consumer[Input type] - accepts ONE argument but does not return the result;
3.Supplier[Output type] - does not accept arguments, but produces ONE result;
4.Function[Input type, Output type] - Accepts ONE argument and produces ONE result;
5.UnaryOperator - single argument with a return value;
6.BinaryOperator - takes two arguments and return one. (param1, param2) -> expression
 */
public interface FunctionalInterface {
    void execute();
}
