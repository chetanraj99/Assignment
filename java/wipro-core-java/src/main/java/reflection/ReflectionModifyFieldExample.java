package reflection;

import java.lang.reflect.Field;

public class ReflectionModifyFieldExample {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 30);

            Class<?> personClass = person.getClass();
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(person, "Jane Doe");

            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person, 25);

            System.out.println("Modified name: " + person.getName());
            System.out.println("Modified age: " + person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

