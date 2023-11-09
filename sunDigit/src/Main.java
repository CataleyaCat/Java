public class Main {
    public static void main(String[] args) {


        System.out.println(sumDigit(125));
            }
            public static int sumDigit(int number){
                int digital = 0;
                int sum = 0;

                while(number > 9){
                            sum += (number % 10);
                            number=number/10;
                        }
                sum += number;
                return sum;
            }
}