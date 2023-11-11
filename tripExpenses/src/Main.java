import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String purchases;
        int purchasesNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of purchases");

        purchases = scanner.nextLine();
        purchasesNumber = Integer.parseInt(purchases);

        System.out.println("Enter your expenses");

        String [] priceList = new String[purchasesNumber];

        for (int i = 0; i < purchasesNumber; i++) {
            priceList[i] = scanner.nextLine();
        };

        double sum = 0;
        for( int i = 0; i < priceList.length; i++){
            sum += Double.parseDouble(priceList[i].replaceAll("[\\s+a-zA-Z :]", ""));
        }
        System.out.println(sum);

        boolean isSorted = false;
        String temp;
        while (!isSorted) {
            isSorted = true;
            for ( int i = 0; i < priceList.length - 1; i++) {
                double element = Double.parseDouble(priceList[i].replaceAll("[\\s+a-zA-Z :]", ""));
                double nextElement = Double.parseDouble(priceList[i+1].replaceAll("[\\s+a-zA-Z :]", ""));
                if (element > nextElement){
                    isSorted = false;
                    temp = priceList[i];
                    priceList[i] = priceList[i+1];
                    priceList[i+1] = temp;
                }
            }

        }
        System.out.println(priceList[0]);
        System.out.println(priceList[priceList.length - 1]);

    }
}