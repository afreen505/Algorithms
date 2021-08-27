package bubbleg;

public class BubbleSortGeneric<T extends Comparable<? super T>> {

    public static void main(String[] args) {

        String[] arrayOfStrings = {"Hello", "Hai", "Mango", "Apple", "Rose", "Jasmine", "Kitten", "Rose", "Mango", "Marvel", "Kitty", "Miracle", "Money", "Tomato", "Rose", "Marigold"};
        BubbleSortGeneric<String> stringSorter = new BubbleSortGeneric<>();// bubble sorting
        stringSorter.bubbleSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));
    }


    public void bubbleSort(T[] array) {
        int n = array.length;
        while (n > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                // if the item at the previous index is greater than the item at the `currentIndex`, swap them
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {
                    // swap
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    // save the index that was modified
                    lastModifiedIndex = currentIndex;
                }
            }

            n = lastModifiedIndex;
        }
    }
}