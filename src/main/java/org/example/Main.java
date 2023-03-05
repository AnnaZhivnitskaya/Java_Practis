package org.example;
public class Main {
    public static void main(String[] args) { //точка входа, запускает все, что внутри скобок

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        int[] array = {1, 1, 1, 1, 0, 1};

        int curr = 0;
        int best = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a == 1) {
                curr++;
            } else {
                if (curr > best) {
                    best = curr;
                }
                curr = 0;
            }
        }
        if (curr > best) {
            best = curr;
        }

        System.out.println(best);

        //Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
//
//       int[] array1 = {1, 2, 2, 2, 1, 5, 3, 2, 3};
//       int val = 3;
//
//       swap(array1, val);
//
//       for (int x : array1) {
//           System.out.print(x + " ");
//       }
//
//       int[] array2 = {1, 2, 2, 2, 1, 5, 3, 2, 3};
//       int val1 = 3;
//
//       swap(array2, val1);
//
//       for (int x : array2) {
//           System.out.print(x + " ");
//       }
//
//       int[] array3 = {1, 2, 2, 2, 1, 5, 3, 2, 3};
//       int val2 = 3;
//
//       swap(array3, val2);
//
//       System.out.println(Arrays.toString(array3));
    }
}






// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку.
//
////    char[] chars = first.toCharArray();
////    char aChar = chars[index];

//static String findCommonPrefix(String[] array) {
//    String first = array[0];
//    for (int i = 1; i < array.length; i++) {
//        if (first.length() > array[i].length()) {
//            first = array[i];
//        }
//    }
//
//    String result = "";
//    first: for (int index = 0; index < first.length(); index++) {
//        char firstIndexChar = first.charAt(index);
//        for (int i = 1; i < array.length; i++) {
//            char secondStringChar = array[i].charAt(index);
//
//            if (firstIndexChar != secondStringChar) {
//                break first;
//            }
//        }
//        result += firstIndexChar;
//    }
//
//    return result;
