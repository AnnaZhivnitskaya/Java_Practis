import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Home_2 {
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

        String text = "TEXT";
        text = text.repeat(100);

        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);

        System.out.println(AbRepeat('a','b',6));
    }
        private static String AbRepeat (char c1, char c2, int n){
            StringBuilder ab = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    ab.append(c2);
                } else {
                    ab.append(c1);
                }
            }
            return ab.toString();
        }
}


