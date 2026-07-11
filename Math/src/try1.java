public class try1 {
    public static void main(String[] args){
       //调用输出法
        // System.out.println(getSum(20,20,30));
        //赋值输出法、
        //第一个季度的营业额
        int sum1 = getSum(10,20,30);
        //第二个季度的营业额
        int sum2 = getSum(20,30,40);
        //第三个季度的营业额
        int sum3 = getSum(40,50,50);
        //第四个季度的营业额
        int sum4 = getSum(50,50,70);
        //年总营业额
        int sum = sum1 + sum2 +sum3 + sum4;
        System.out.println(sum);
    }
    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}

