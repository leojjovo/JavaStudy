//金额转换：
//在模拟发票当中
//给出阿拉伯数字金额，把阿拉伯数字金额转换为中文大写数字金额 例如：1234——零佰零拾零万壹仟贰佰叁拾肆元

import java.util.Scanner;

public class DemoString5 {
    static void main(String[] args) {
        //键盘录入金额
        Scanner sc = new Scanner(System.in);
        //初始化money
        int money;
        while (true){
            //验证金额
            System.out.println("请输入您的金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            }else {
                System.out.println("对不起，您输入的金额有误！");
            }
        }
        // 得到键盘输入的金额,将金额转化为大写中文数字
        String moneyStr = "";
        while (true){
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            money = money / 10;
            if (money == 0) {
                break;
            }
        }
        //补零在零金额的单位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" +  moneyStr;
        }
        //补齐单位
        String result = "";
        System.out.println(moneyStr);
        for (int i = 0; i < moneyStr.length(); i++) {
            String[] arr = {"佰","拾","万","仟","佰","拾","元"};
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }
    //定义一个方法，包含字符数组提供数组转换中文大写数字的方法
    public static String getCapitalNumber(int number){
        String [] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
