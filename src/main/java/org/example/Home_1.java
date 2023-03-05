package org.example;

public class Home_1 {
    public static void main(String[] args) {

        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true

//
//        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
//        int x = array[2][3];



    }
//
//    /**
//     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
//     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20

        if ((a + b) < 10 || (a + b) > 20)
            return false;
        else
            return true;
        }


    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x <= 0)
            return false;
        else
            return true;
    }

    private static void printString(String str, int num) {
        // напечатать строку source repeat раз
        str = "abcd";
        num = 5;
        String sourceRepeat = str.repeat(num);
        System.out.println (sourceRepeat);
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true

        if((year %4 == 0) && ((year % 400 == 0) || (year % 100 != 0)))
            return true;
        else
            return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue

        int [] array = new int [len];

        for(int i = 0; i < array.length; i++)
            array[i] = initalValue;

        return array;
    }


}
