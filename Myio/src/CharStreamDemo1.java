import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    static void main(String[] args) throws IOException {
        //public FileReader(File file)       创建字符输入流关联本地文件
        //public FileReader(String pathname) 创建字符输入流关联本地文件
        //public int read()                  读取数据，读到末尾返回-1
        //public int read()                  读取多个数据，读到末尾返回-1
        //public void close()                释放资源/关流
        FileReader fr = new FileReader("src\\b.txt");
        //定义一个整形变量接收字节
        int ch;
        //利用循环遍历所有的字节
        while ( (ch = fr.read()) != -1){
        //到此，必须在打印的时候将ch进行强转，不然输出的ch结果是字节，不是实际的字符集
            //细节：println会将每一个字都会换行，不会连上，因此设定为print不换行，得出正确的顺序结构结果
        System.out.print((char) ch);
        }
        //关流
        fr.close();
    }
}
