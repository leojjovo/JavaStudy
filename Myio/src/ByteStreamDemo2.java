import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
   public static void main(String[] args) throws IOException {
        /*
        void write(int b) 一次写一个数组
        void write(byte[] b) 一次写一个字节数组数据
        void write(int 吧，int off，int len) 一次写一个数组的部分数据

         */
       //创建对象
       FileOutputStream fos  = new FileOutputStream("src\\b.txt");
       //写入数组
       //第一种 一次只写一个数据
       //fos.write(97);
       //第二种 一次写一个字节数组数据
       //1.先创建 一个字节数组
       byte[] bytes = {97,98,99,100,101};
       //fos.write(bytes);
       //第三种 一次写一个数组的部分数据
       fos.write(bytes,1,3);
       //释放资源
       fos.close();
    }
}
