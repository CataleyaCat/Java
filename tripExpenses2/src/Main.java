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
            String[][] bufferParts = new String[purchasesNumber][purchasesNumber];
            bufferParts[i] = buffer.split(" ");
            expensesNames[i] = bufferParts[i][0];
            costExpenses[i] = Double.parseDouble(bufferParts[i][1]);
        }
        double sum = 0;
        for (int i = 0; i < costExpenses.length; i++) {
            sum += costExpenses[i];
        }
        System.out.println(sum);

        int minValueIndex = 0;
        for (int i = 0; i < costExpenses.length - 1; i++){
            if (costExpenses[i] < costExpenses[minValueIndex]){
                minValueIndex = i;
            }
        }
        System.out.println(expensesNames[minValueIndex] + ' ' + costExpenses[minValueIndex]);

        int maxValueIndex = 0;
        for (int i = 0; i < costExpenses.length - 1; i++){
            if (costExpenses[i] > costExpenses[maxValueIndex]){
                maxValueIndex = i;
            }
        }
        System.out.println(expensesNames[maxValueIndex] + ' ' + costExpenses[maxValueIndex]);
    }
}