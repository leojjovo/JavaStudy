import java.io.*;

public class BufferDemo3 {
    public static void main(String[] args) throws IOException {
        //定义一个字符输入流
        BufferedReader br = new BufferedReader(new FileReader("src\\c.txt"));
        String line = br.readLine();
        br.close();
        //将line里的字符串转换为整数
        int number = Integer.parseInt(line);
        number++;
        //判断这个整数是否小于3，如果小于，就输出
        if (number <= 3) {
            System.out.println("欢迎使用本软件，，第 " + number + " 次使用免费");
        }else {
            System.out.println("本软件免费试用三次，请购买会员后继续使用");
        }
        //定义一个直接输出流将每次使用次数写入文件
        BufferedWriter pw = new BufferedWriter(new FileWriter("src\\c.txt"));
        pw.write(number + "");
        pw.close();
    }
}
