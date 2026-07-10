import java.util.Scanner;

public class DemoString1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = sc.next();
         int bigcount = 0;
         int smallcount = 0;
         int numbercount = 0;
        for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);//利用charAt()方法把字符串拆解
            if (c >= 'a' && c <= 'z') {
                smallcount++;
            }
            if (c >='A' && c <= 'Z' ) {
                bigcount++;
            }
            if (c >= '0' && c <= '9') {
                numbercount++;

            }
        }
        System.out.println("整数有"+ numbercount + "个");
        System.out.println("大写字母有"+  bigcount+ "个");
        System.out.println("小写字母有"+ smallcount + "个");

        }
    }
