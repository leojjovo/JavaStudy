import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamDemo5 {
    //文件拷贝进阶版
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //创建输入输出路径
        FileInputStream  fis = new FileInputStream("src\\a.txt");
        FileOutputStream fos = new FileOutputStream("src\\copy.txt");
        //读取
        //定义一个变量来接收长度
        int len;
        //定义一个字节数组(意思就是创建一个5MB长度大小的字节数组来5MB每次的拷贝（节约时间）)
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len= fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        //释放资源
        //细节：后开的先释放
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
