import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getSortedArray(getRandomArray(5));
        getReSortedArray(getRandomArray(5));
        getSortedArray(getRandomArray(5));
        getSortedArray2(getRandomArray(5));


    }
    public static int[] getRandomArray(int length){
        Random random = new Random();
        int[] array = new int[length];
        for ( int i = 0; i < length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] getSortedArray(int [] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public static int[] getReSortedArray(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] getSortedArray1(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length; i++){
                if(array[i] > array[i+1]){
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] getSortedArray2(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = array.length - 1; i >= 1; i--){
                if(array[i] > array[i-1]){
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}