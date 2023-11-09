import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double min = 0;
        double max = 0;
        int loopCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number ");
            String number = scanner.nextLine();

            try {
                double validNum = Double.parseDouble(number);
                if(loopCount == 0 || validNum < min){
                    min = validNum;
                }
                if ( loopCount == 0 || validNum > max){
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException exception){
                break;
            }

        }
        if (loopCount > 0) {
            System.out.println( "min = " + min + ", max = " + max);
        } else {
            System.out.println("There were not entered values");
        }
    }
}