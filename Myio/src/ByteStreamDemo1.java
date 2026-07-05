import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        尝试字节输出流 FileOutputStream
        写出一段文字到本地文件中
        步骤：
        创建对象
        写出数据
        释放资源
         */
        //1.创建对象
        FileOutputStream fos = new FileOutputStream("src\\a.txt");
        //写出数据
        byte[] bytes = {97, 98,99,100,101};
        fos.write(bytes,2,3);
        //释放资源
        fos.close();

    }
}
