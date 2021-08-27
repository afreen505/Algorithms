package insertiongeneric;
public class InsertionSortGeneric<T extends Comparable<? super T>> {
    public static void main(String[] args) {

        String[] arrayOfStrings = { "Afreen", "Fathima", "Rose", "Lilly" };
        InsertionSortGeneric<String> stringSorter = new InsertionSortGeneric<>();
        stringSorter.insertionSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));
    }

    public void insertionSort(T[] array) {

        for (int i = 1; i < array.length; i++) {

            int currentIndex = i;

            while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {

                T temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
    }
}
