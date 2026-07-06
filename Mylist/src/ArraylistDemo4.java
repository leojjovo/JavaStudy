import java.util.ArrayList;
import java.util.Scanner;

//定义一个集合，添加一些学生对象（要求对象数据来自键盘录入），并进行遍历，学生类的属性：姓名，年龄
public class ArraylistDemo4 {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList<Student> list = new ArrayList<>();
        //添加一些学生对象（要求对象数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student(); //这一步不能放在循环外，不然地址值将会被最后一个覆盖！！
            System.out.println("请输入学生名字：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();

            //把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            //把学生对象添加到集合当中
            list.add(s);

            //进行遍历
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
