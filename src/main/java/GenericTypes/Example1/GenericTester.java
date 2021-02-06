package GenericTypes.Example1;

/*
Convention(taisykle) we specify generic type in an Uppercase letter.
E, T - element type
K, - key type (map)
V - value type (map)
N - number type
...Many more...
 */
public class GenericTester {
    public static void main(String[] args) {
        Car car = new Car();
        GenericBox<Car> boxForCars = new GenericBox<>(car);

        Person person = new Person();
        GenericBox<Person> boxForPeople = new GenericBox<>(person);

        GenericBox<Object> boxForEverything = new GenericBox<>(person);
        boxForEverything.setItem(car);



    }
}

class GenericBox<T> {
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Car {
    @Override
    public String toString() {
        return "I am a car.";
    }
}

class Person {
    @Override
    public String toString() {
        return "I am a person.";
    }
}