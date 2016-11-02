package Kolekce;

public class PouzitiSelectionSort {

    public static void main(String[] args) {
        int[] mojePoleSelSort = new int[3];
        mojePoleSelSort[0] = 1;
        mojePoleSelSort[1] = 3;
        mojePoleSelSort[2] = 5;

        selectionSort(mojePoleSelSort);
        System.out.println(mojePoleSelSort[0]);

    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = tmp;
        }
    }
}
