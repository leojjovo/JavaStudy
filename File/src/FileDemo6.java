import java.io.File;

public class FileDemo6 {
    static void main(String[] args) {
        File file = new File("c:\\aaa");
        long len = getLen(file);
        System.out.println(len);

    }
    public static long getLen(File src){
        long len = 0;
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                len = len + file.length();
            }else {
                len = len + getLen(file);
            }

        }
        return len;

    }
}