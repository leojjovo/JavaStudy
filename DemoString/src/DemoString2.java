import java.util.Scanner;

public class DemoString2 {
    static void main(String[] args) {
        //已知账户
        String rightusername = "xiaoming";
        String rightpassword = "abc1234";
        //输入登录信息
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
        System.out.println("请输入账号：");
        String username = sc.next();
        System.out.println("请输入你的密码：");
        String password = sc.next();
        //验证登录信息
            if (rightusername.equals(username) && rightpassword.equals(password)) {
                System.out.println("登录成功");
                break; //若输入正确，跳出循环
            } else { //剩余的机会中失败，则重新输入
                System.out.println("您的账号或密码错误！还剩" + (2 - i) + "次机会" );

            }
            if (i == 2) {
                System.out.println("对不起，账户" + username + "已被锁定!");

            }
        }


        }

    }

