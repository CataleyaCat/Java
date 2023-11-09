import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println(getInputFromScanner(2023));

    }
        public static String getInputFromScanner ( int currentYear){
            Scanner scanner = new Scanner(System.in);

            System.out.println("What is your name?");
            String name = scanner.nextLine();

            System.out.println("Hi " + name);

            System.out.println("What year were you born?");
            String dateOfBirth = scanner.nextLine();
            int age = currentYear - Integer.parseInt(dateOfBirth);

            return "So, you are " + age + " years old";
        }

        public static int checkData( int currentYear, String dateOfBirth){
            int dob = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;

            if ((dob < minimumYear) || (dob > currentYear)){
                return -1;
            }
            return (currentYear - dob);
        }
}