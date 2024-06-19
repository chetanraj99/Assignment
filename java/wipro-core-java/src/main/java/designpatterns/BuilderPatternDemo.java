package designpatterns;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Create a pizza with cheese and pepperoni
        Pizza pizza1 = new Pizza.Builder("Large")
                            .addCheese()
                            .addPepperoni()
                            .build();

        // Create a vegetarian pizza with mushrooms
        Pizza pizza2 = new Pizza.Builder("Medium")
                            .addMushrooms()
                            .build();

        // Print the details of the pizzas
        System.out.println("Pizza 1:");
        System.out.println("Size: " + pizza1.getSize());
        System.out.println("Cheese: " + pizza1.hasCheese());
        System.out.println("Pepperoni: " + pizza1.hasPepperoni());
        System.out.println("Mushrooms: " + pizza1.hasMushrooms());

        System.out.println("\nPizza 2:");
        System.out.println("Size: " + pizza2.getSize());
        System.out.println("Cheese: " + pizza2.hasCheese());
        System.out.println("Pepperoni: " + pizza2.hasPepperoni());
        System.out.println("Mushrooms: " + pizza2.hasMushrooms());
    }
}
