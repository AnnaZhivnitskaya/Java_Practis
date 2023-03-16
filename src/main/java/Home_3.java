import java.util.ArrayList;

import java.util.Random;

public class Home_3 {

//     1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(100));
        }
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 > 0) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);

// 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются
//    числами
//    Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5",
//    "10", "-12", "my_value"));
//     ["string", "s", "my_value"]

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("5");
        arr2.add("12");
        arr2.add("#$#");
        arr2.add("data");
        arr2.add("-1000");
        arr2.add("sea");
        arr2.add("0");
        arr2.add("room");
        arr2.add("51237");
        System.out.println(arr2);

        for (int i = 0; i < arr2.size(); i++) {
            try {
                Integer.parseInt(arr2.get(i));
                arr2.remove(i);
                i--;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(arr2);
    }
}





