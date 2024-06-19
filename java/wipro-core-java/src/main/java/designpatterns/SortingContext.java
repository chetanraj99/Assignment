package designpatterns;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void executeStrategy(int[] array) {
        sortingStrategy.sort(array);
    }
}
