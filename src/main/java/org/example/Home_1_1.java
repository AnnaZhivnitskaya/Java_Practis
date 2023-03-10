package org.example;

import java.util.Arrays;
import java.util.Random;

public class Home_1_1 {
    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

//        int[] arrey = new int [10];
//
//        Random random = new Random();
//
//        for(int i = 0; i< arrey.length; i++) {
//            arrey[i] = random.nextInt(2);
//            System.out.println(arrey[i]);
//        }
//
//        for(int i = 0; i< arrey.length; i++){
//            if(arrey[i] == 0)
//                arrey[i] =+ 1;
//            else arrey[i] =+ 0;
//            System.out.println(arrey[i]);
//        }
//
//        // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        // и числа меньшие 6 умножить на 2;
//        int[] arr = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] < 6)
//                arr[i] = arr[i] * 2;
//
//            System.out.println(arr[i]);
//        }

        // 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        // Также заполнить элементы побочной диагонали
        // int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        // int x = array[2][3];

        int[][] array = new int[4][4];

        Random rand = new Random();

        for(int i = 0; i< array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rand.nextInt(9);
            }
            System.out.println(Arrays.toString(array));
        }


//        for (int a = 0; a < array.length; a++) {
//            for (int b = 0; b < array.length; b++){
//                if(array[a] == array[b]){
//                    array[a][b] = 0;
//                }
//            }
//            System.out.println(Arrays.toString(array));
//        }

    }
}
