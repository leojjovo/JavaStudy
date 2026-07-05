import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//文件拷贝基础
public class ByteInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建
        FileInputStream fis = new FileInputStream("src\\a.txt");
        FileOutputStream fos = new FileOutputStream("src\\copy.txt");
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);}
        fos.close();
        fis.close();
    }
}
