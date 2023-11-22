import java.util.*;

public class Main {
    public static void main(String[] args) {
//        task1("qwerewq");
//        task1("qweewq");
//        task1("qwe22ewq");
//        task1("q1werewq");
//
//        System.out.println(task2("qwerewq"));
//        System.out.println(task2("qweewq"));
//        System.out.println(task2("qwe22ewq"));
//        System.out.println(task2("q1werewq"));

//        task3(0, 15, 5);
//        task3(20, 100, 20);

//        task4(0, 15, 5);
//        task4(20, 100, 20);

//        task5(89632569);

//        task6(125);

//        task7(3, 4);

//        task8(3);
//        task8(5);

//        System.out.println(task9(5));

//        task10("Cat", "Dog");
//        task10("Rainbow", "Rain");
//        task10("storm", "sea");

//        task11(3);
        task12(5);
    }

    // Создать переменную типа String и присвоить ей значение.
    // Определить, является ли это значение палиндромом. (палиндром : “123321” или “aba” или “a1b99b1a”).
    // Использовать цикл for.
    public static boolean task1(String value) {

        boolean isPalindrome = true;
        char[] potentialPalindrome = value.toCharArray();
        int backwardChar = potentialPalindrome.length - 1;
        for (int i = 0; i < potentialPalindrome.length / 2; i++) {
            if (potentialPalindrome[i] == potentialPalindrome[backwardChar]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            backwardChar--;
        }
        if (isPalindrome == true) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }

        return false;
    }

    public static boolean task2(String value) {
        // Решить задачу 1, используя цикл while.

        int length = value.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = value.charAt(forward++);
            char backwardChar = value.charAt(backward--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }
        return true;
    }

    public static void task3(int min, int max, int step) {
        // Написать код, который будет выводить в консоль числа в определенном диапазоне с определенным шагом
        // (например, min = 0, max = 15, step = 5 выведет 0, 5, 10, 15).
        // Использовать цикл for.

        for (int i = min; i <= max; i += step) {
            System.out.println(i);
        }
    }

    public static void task4(int min, int max, int step) {
        while (min <= max) {
            System.out.println(min);
            min += step;
        }
        // Решить задачу 3, используя цикл while.
    }

    public static void task5(int value) {
        do {
            int number = value % 10;
            System.out.println(number);
            value = value / 10;
        }
        while (value > 9);
        System.out.println(value);
        // Создать переменную типа int и присвоить ей значение (минимум 6 знаков).
        // Вывести в консоль каждую цифру данного числа, начиная с последней.
    }

    public static int task6(int value) {
        // Модифицировать задачу 5 так, чтобы дополнительно выводилась сумма цифр числа.
        int sum = 0;
        int number = 0;
        while (value > 9) {
            number = value % 10;
            sum += number;
            System.out.println(number);
            value = value / 10;
        }
        System.out.println(value);
        sum += value;
        System.out.println(sum);
        return sum;
    }

    public static void task7(int rows, int columns) {
        // Написать код, который будет выводить таблицу умножения rows * columns
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }

    public static int task8(int childAmount) {
        // Есть семья из childAmount детей.
        // У каждого ребенка есть яблоки: у первого - одно, у второго - два, etc.
        // Вывести в консоль положительный баланс семьи в яблоках, используя циклы.
        int balance = 0;
        for (int i = 1; i <= childAmount; i++) {
            balance += i;
        }

        System.out.println(balance);
        return 0;
    }

    public static int task9(int value) {
        // Написать метод расчета факториала числа.
        int factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void task10(String value1, String value2) {
        // Дано 2 строки. Вывести все символы из первой строки, которых нет во второй.
        char[] arr1 = value1.toCharArray();
        char[] arr2 = value2.toCharArray();
        List<Character> arr3 = new ArrayList<Character>();
        for (int i = 0; i < arr1.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = 1;
                }
            }
            if (flag != 1) {
                arr3.add(arr1[i]);
            }
        }

        System.out.println(Arrays.toString(arr3.toArray()));
    }

    public static void task11(int n) {
        // Написать цикл, что будет выводить в консоль фигуры с помощью *: квадрат со стороной из n звезд
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void task12(int n) {
        // Написать цикл, что будет выводить в консоль фигуры с помощью *: равносторонний треугольник с основанием из n звезд
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
            for (int j = 1; j < 2 * i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
