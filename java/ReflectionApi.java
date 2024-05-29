import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person("John");

        // Access private field
        Field nameField = Person.class.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("Name (via reflection): " + nameField.get(person));

        // Modify private field
        nameField.set(person, "Jane");
        System.out.println("Modified Name (via reflection): " + nameField.get(person));

        // Access private method
        Method getNameMethod = Person.class.getDeclaredMethod("getName");
        getNameMethod.setAccessible(true);
        System.out.println("Name (via private method): " + getNameMethod.invoke(person));
    }
}
