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

        String[] expensesNames = new String[purchasesNumber];
        double[] costExpenses = new double[purchasesNumber];

        for (int i = 0; i < purchasesNumber; i++) {
            String buffer = scanner.nextLine();
            int index = buffer.lastIndexOf(" ");
            expensesNames[i] = buffer.substring(0, index);
            costExpenses[i] = Double.parseDouble(buffer.substring(index + 1, buffer.length()));
        }

        calcSum(costExpenses);
        getMin(expensesNames, costExpenses);
        getMax(expensesNames, costExpenses);
    }


    public static void calcSum(double[] costExpenses) {
        double sum = 0;
        for (double element : costExpenses) {
            sum += element;
        }
        System.out.println(sum);
    }

    public static void getMin(String[] expensesNames, double[] costExpenses) {
        int minValueIndex = 0;
        for (int i = 0; i < costExpenses.length; i++) {
            if (costExpenses[i] < costExpenses[minValueIndex]) {
                minValueIndex = i;
            }
        }
        System.out.println(expensesNames[minValueIndex] + ' ' + costExpenses[minValueIndex]);
    }

    public static void getMax(String[] expensesNames, double[] costExpenses) {
        int maxValueIndex = 0;
        for (int i = 0; i < costExpenses.length; i++) {
            if (costExpenses[i] > costExpenses[maxValueIndex]) {
                maxValueIndex = i;
            }
        }
        System.out.println(expensesNames[maxValueIndex] + ' ' + costExpenses[maxValueIndex]);
    }
}
