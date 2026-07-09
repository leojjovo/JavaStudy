import java.io.File;

public class FileDemo3 {
    static void main(String[] args) {
        File file = new File("File\\aaa");
        boolean b = haveTxt(file);
        System.out.println(b);

    }
    public static boolean haveTxt(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".txt")) {
                return true;

            }
        }return false;
    }
}

