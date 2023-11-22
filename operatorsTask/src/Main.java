public class Main {

    public static void main(String[] args) {
//        System.out.println(task1(3, 1, 2));

//        task2(3);
//        task2(5);
//        task2(15);
//        task2(30);
//        task2(4);
//        task2(0);

        task3(3);
        task3(5);
        task3(15);
//        task3(30);
//        task3(4);
//        task3(0);

    }
    public static int task1(int firstValue, int secondValue, int thirdValue) {

        if((firstValue <= thirdValue && firstValue >= secondValue) || (firstValue <= secondValue && firstValue >= thirdValue))  {
            return firstValue;
        }else if ((secondValue <= thirdValue && secondValue >= firstValue) || (secondValue >= thirdValue && secondValue <= firstValue)){
            return secondValue;
        } else {
            return thirdValue;
        }
        // Создать 3 переменные типа int и присвоить им значения.
        // Написать код, который будет находить среднее из них (например, из чисел 1, 3 и 5 средним является число 3).
    }

    public static void task2(int value) {
        if(value % 3 == 0){
            System.out.println("Fiz");
        } else if (value % 5 == 0) {
            System.out.println("Buz");
        }
        else if(value % 3 == 0 && value % 5 == 0){
            System.out.println("FizBuz");
        }
        else {
            System.out.println("value is not divisible not by 3, neither 5");
        }
        // Создать переменную типа int и присвоить ей значение.
        // Если она кратна 3 - вывести в консоль слово "Fiz", если кратна 5 - "Buz", если кратна и 3,и 5 - "FizBuz".
        // Решение задачи должно использовать if-else.
    }

    public static void task3(int value) {
        switch (value % 3){
            case 0 -> System.out.println("Fiz");
//            default -> System.out.println("value is not divisible not by 3");
        }
        switch (value % 5) {
            case 0 -> System.out.println("Buz");
        }
        switch ((value % 3) + (value % 5)){
            case 0 -> System.out.println("FizBuz");
        }

        // Решить задачу 2 с помощью switch
    }

    public static boolean task4(int firstValue, int secondValue, int thirdValue) {
        // Создать 3 переменные типа int и присвоить им значения.
        // Определить, может ли быть построен треугольник с длинами сторон, равными значениям этих переменных.
        return false;
    }

    public static void task5(int a, int b, int c) {
        // В три переменные a, b и c записаны три вещественных числа.
        // Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
        // либо сообщать, что корней нет.
    }

    public static void task6(int firstValue, int secondValue, int thirdValue) {
        // В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
        // Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность
        // a, b и c оказалась строго возрастающей.
    }

    public static void task7(int seconds) {
        // Инженер Феродов создал устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
        // Когда рабочий день начинается (9 утра) — табло отображает «28800» (т.е. остаётся 8 часов),
        // когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
        // а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).

        // Программист Васильев заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
        // Васильев вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы
        // с информацией о том, сколько полных часов осталось до конца рабочего дня.
        // Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».

        // Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
        // далее оно должно выводиться на экран (для Федорова) и на следующей строке (для сотрудниц) должна выводиться фраза
        // о количестве полных часов, содержащихся в n секундах.
    }
}