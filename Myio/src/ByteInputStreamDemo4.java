import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//文件拷贝基础原理演示
public class ByteInputStreamDemo4 {
    static void main(String[] args) throws IOException {
        //创建
        FileInputStream fis = new FileInputStream("src\\a.txt");
        //读取数据
        //创建一个长度为2的字节数组
        byte[] bytes = new byte[2];
        //创建一个整形len变量去接收长度
        int len1 = fis.read(bytes);
        System.out.println(len1);
        //创建一个字符串对象把字节变成字符串然后接收
        String str1 = new String(bytes,0,len1);
        System.out.println(str1);
        int len2 = fis.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes,0,len2);
        System.out.println(str2);
        int len3 = fis.read(bytes);
        System.out.println(len3);
        String str = new String(bytes,0,len3);
        //释放资源
        fis.close();

    }
}
