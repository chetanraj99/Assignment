package designpatterns;

public class Singleton {
	
	// Private constructor to prevent instantiation
    private Singleton() {
        // Initialization code here
    }

    // Inner static helper class responsible for holding the Singleton instance
    private static class SingletonHelper {
        // The Singleton instance is created when this class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Example method to demonstrate the Singleton functionality
    public void showMessage() {
        System.out.println("Hello from Singleton instance!");
    }


}
