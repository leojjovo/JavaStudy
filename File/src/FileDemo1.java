import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    static void main(String[] args) {
        File f2 = new File("c:\\aaa");
        File[] files = f2.listFiles();
        for (File file : files) {
            System.out.println(file);

        }
    }
}
