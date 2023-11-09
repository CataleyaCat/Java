public class SumDigit {

    public static void main(String[] args) {

        sumDigit(125);
    }
        int sum;
        int digital;
        public static int sumDigit(int number){
            while(number / 10 == 0){
                digital = number % 10;
                sum +=digital;
                number=number/10;
            }
            return sum;

        }


}
