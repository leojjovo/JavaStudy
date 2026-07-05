import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    //实现换行操作
    static void main(String[] args) throws IOException {
        //细节，FileOutStream里面路径后面其实还有一个是否续写的bollean，如果传递一个true，就表示续写，不会覆盖原有的数据，如果不写或是fasle，那就表示默认把里面的数据覆盖
        FileOutputStream fos = new FileOutputStream("src\\a.txt",true);
        //定义字符
        String str = "Hello";
        byte[] bytes1 = str.getBytes();
        fos.write(bytes1);
        //新定义一个字符串“\r\n进行换行
        String wrap = "\r\n";
        //创建字节数组
        byte[] bytes = wrap.getBytes();
        //写入

        fos.write(bytes);
        String str1 = "nihao";
        byte[] bytes2 = str1.getBytes();
        fos.write(bytes2);
        fos.close();
    }
}
