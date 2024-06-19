package designpatterns;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 9};

        SortingContext context = new SortingContext();

        // Use Bubble Sort
        context.setSortingStrategy(new BubbleSortStrategy());
        context.executeStrategy(array);

        // Use Quick Sort
        context.setSortingStrategy(new QuickSortStrategy());
        context.executeStrategy(array);

        // Use Merge Sort
        context.setSortingStrategy(new MergeSortStrategy());
        context.executeStrategy(array);
    }
}
