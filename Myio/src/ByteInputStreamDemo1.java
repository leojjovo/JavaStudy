import java.io.FileInputStream;
import java.io.IOException;

public class ByteInputStreamDemo1 {
    static void main(String[] args) throws IOException {
        /*
        内容：字节输入流FileInputStream
        步骤：
        1创建对象
        2读取数据
        3释放资源
         */
        //1.创建对象
        FileInputStream fis = new FileInputStream("src\\b.txt");
        //2.读取数据
        int read1 = fis.read();
        System.out.println((char) read1);
        int read2 = fis.read();
        System.out.println((char) read2);
        int read3 = fis.read();
        System.out.println((char) read3);
        int read4 = fis.read();
        System.out.println((char) read4);
        //3.释放资源
        fis.close();

    }
}
