import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\b.txt");
        //创建一个长度为字符集
        char[] chars = new char[2];
        int len;
        //创建while循环
        //把char数组放进read里面，表示一次可以读两个字节
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        //释放资源
        fr.close();
    }
}
