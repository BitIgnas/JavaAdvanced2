package LambdaExpression.functionalInterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierService implements FunctionalInterface {

    @Override
    public void execute() {
        //Supplier Functional interface - represents supplier of results.
        //Does not accept any arguments.

        Supplier<String> supplier = () -> "[Supplier] Java is fun but confusing.";
        System.out.println(supplier.get());

        Supplier<LocalDateTime> dateTimeSupplier = () -> LocalDateTime.now();
        System.out.println("[Supplier] current date: " + dateTimeSupplier.get());


    }
}
