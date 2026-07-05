import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    static void main(String[] args) throws IOException {
        //void write(int c)                             写出一个字符
        //void write(String str)                        写出一个字符串
        //void write(String str,int off,int len)        写出一个字符串的一部分
        //void write(char[] chars)                      写出一个字符数组
        //void write(char[] chars,int off,int len)      写出字符数组的一部分
        FileWriter fw = new FileWriter("src\\a.txt",true);
        char[] chars = {'a','b','你'};
        fw.write(chars);
        fw.close();
    }
}
