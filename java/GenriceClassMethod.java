import java.util.Arrays;

class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"One", "Two", "Three", "Four"};

        System.out.println("Before swap: " + Arrays.toString(intArray));
        swap(intArray, 0, 3);
        System.out.println("After swap: " + Arrays.toString(intArray));

        System.out.println("Before swap: " + Arrays.toString(strArray));
        swap(strArray, 1, 2);
        System.out.println("After swap: " + Arrays.toString(strArray));
    }
}
