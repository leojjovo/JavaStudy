import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字节缓存输入流
        BufferedReader bf = new BufferedReader(new FileReader("src\\b.txt"));
        //定义一个字符串接收读取到的内容
        String line;
        //利用while去遍历每一行，然后到达换行 null时候停止
        while ((line = bf.readLine()) != null){
            System.out.println(line);
        }
        //释放资源
        bf.close();


    }
}
