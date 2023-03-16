import java.util.ArrayList;

public class Home_3_1 {
    public static void main(String[] args){
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
