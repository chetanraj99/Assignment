import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        Person person = new Person("John", 30);

        Predicate<Person> isAdult = p -> p.getAge() >= 18;
        Function<Person, String> getName = Person::getName;
        Consumer<Person> printPerson = p -> System.out.println("Person details: " + p);
        Supplier<Person> personSupplier = () -> new Person("Jane", 25);

        System.out.println("Is adult: " + isAdult.test(person));
        System.out.println("Name: " + getName.apply(person));
        printPerson.accept(person);
        System.out.println("Supplied person: " + personSupplier.get());
    }
}
