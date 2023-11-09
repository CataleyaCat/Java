public class SwitchCase {
    public static void main(String[] args) {
        literalCode('a');
        literalCode('d');

    }

    public static void literalCode(char letter){
        switch(letter){
            case 'a': System.out.println("Able");
                break;

            case 'b': System.out.println("Baker");
                break;

            case 'c': System.out.println("Charlie");
                break;

            case 'd': System.out.println("Dog");
                break;

            case 'e': System.out.println("Easy");
                break;

            default: System.out.println("Invalid Character");

        }
    }
}
