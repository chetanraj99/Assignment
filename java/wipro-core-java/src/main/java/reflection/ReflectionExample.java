package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}


public class ReflectionExample {
	public static void main(String[] args) {
		Person p = new Person();
		try {
			Class<?> personClass = Class.forName("reflection.Person");

			System.out.println("Class Name: " + personClass.getName());

			Constructor<?>[] constructors = personClass.getDeclaredConstructors();

			for (Constructor<?> constructor : constructors) {
				System.out.println("Constructor: " + constructor);
			}

			Method[] methods = personClass.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println("Method: " + method.getName());
			}

			Field[] fields = personClass.getDeclaredFields();
			for (Field field : fields) {
				System.out.println("Field: " + field.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
