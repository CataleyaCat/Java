import java.util.Arrays;
import java.util.Random;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr4 = new int[]{63, 23, 54, 87, 8, 3, 2};
//        task1(arr1, arr2);
        task4(arr4);
//        task2(arr1);
//        task3(arr2);
//        task5(arr4);
    }
    public static void task1(int[] arr1, int[] arr2) {
        // Создать 2 массива с числами.
        // Написать код, который будет складывать значение из одного массива со значением из второго и сохранять это в третий массив.
        // Вывести третий массив на экран.
        int[] arr3 = new int[5];
        for (int i = 0; i < arr3.length; i++){
            arr3[i] = arr1[i] + arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void task2(int[] array) {
        // Создать массив со значениями.
        // С помощью for “перевернуть” массив и вывести его на экран.
        for( int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void task3(int[] array) {
        // Решить задачу 3, используя while
        int i = 0;
        while(i < array.length / 2){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task4(int[] array) {
        // Создать массив со значениями.
        // Найти минимальное и максимальное значения. Вывести их на экран.
        // Использовать в реализации: for
        int maxValue = 0;
        for (int el : array){
            if(el > maxValue){
                maxValue = el;
            }
        }
        System.out.println("Max value = " + maxValue);

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if(array[i] < maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("Min value = " + maxValue);

    }

    public static void task5(int[] array) {
        // Решить задачу 4, используя while
        int minValue = Integer.MIN_VALUE;
        int i = 0;
        while(i < array.length){
            if(array[i] > minValue){
                minValue = array[i];
                i++;
            }
            i++;
        }
        System.out.println("Max value = " + minValue);

        int maxValue = Integer.MAX_VALUE;
        i = 0;
        while(i < array.length){
            if(array[i] < maxValue){
                maxValue = array[i];
            }
            i++;
        }
        System.out.println("Min value = " + maxValue);
    }
}