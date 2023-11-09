import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


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
    private static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for( int i =0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}