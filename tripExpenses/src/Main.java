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

        double elementMin = 0;
        double minValue = Double.MAX_VALUE;

        for (int i = 0; i < priceList.length; i++) {
            elementMin = Double.parseDouble(priceList[i].replaceAll("[\\s+a-zA-Z :]", ""));

            if (elementMin < minValue) {
                minValue = elementMin;
            }
        }

        System.out.println("Min expense " + minValue);

        double elementMax = 0;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < priceList.length; i++) {
            elementMax = Double.parseDouble(priceList[i].replaceAll("[\\s+a-zA-Z :]", ""));

            if (elementMax > maxValue) {
                maxValue = elementMax;
            }
        }

        System.out.println("Max expense " + maxValue);

    }
}