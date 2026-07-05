import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo2 {
    static void main(String[] args) throws IOException {
        //定义一个字节缓存输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\c.txt"));
        bw.write("hello world");
        //bw.newLine()方法可以实现换行,但是需要在写入内容后调用
        bw.newLine();
        //释放资源
        bw.close();
    }
}
