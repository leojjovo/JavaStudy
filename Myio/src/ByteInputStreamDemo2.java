import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputStreamDemo2 {
   public static void main(String[] args) throws IOException {
        //利用循环优化ByteInputStreamDemo1的代码
        //创建路径
        FileInputStream fis = new FileInputStream("src\\b.txt");
        //遍历读取
        //先定义一个变量来接收进来的数据
        int b;
        while ((b = fis.read()) != -1){
        System.out.println((char) b);
        }
        //释放资源
        fis.close();
    }
}
