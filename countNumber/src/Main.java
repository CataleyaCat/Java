import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        while (count < 6){
            System.out.println("Enter number " + count);

           try {String number = scanner.nextLine();
            int currentNumber = Integer.parseInt(number);
               sum += currentNumber;
               count++;}
           catch (NumberFormatException exception){
               System.out.println("Invalid Value");
           }

        }
       System.out.println(sum);

    }
}