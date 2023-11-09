import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] newArray = getIntegers(5);
        System.out.println(Arrays.toString(newArray));

        int returnedMin = findMin(newArray);
        System.out.println("min = " + returnedMin);


    }
    public static int[] getIntegers (int arraySize){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int [] enteredUnsortedArray = new int[arraySize];
        System.out.println("Enter the elements of the array: ");
        while (i < arraySize){
            enteredUnsortedArray[i]  = scanner.nextInt();
            i++;

        }
        return enteredUnsortedArray;

    }

    public static int findMin(int [] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min){
                min = el;
            }
        }
        return min;
    }
}