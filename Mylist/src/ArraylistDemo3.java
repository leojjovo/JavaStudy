import java.util.ArrayList;

//定义一个集合，添加一些学生对象，并进行遍历
//学生类属性为：姓名，年龄
public class ArraylistDemo3 {
    static void main(String[] args) {
        //定义一个集合
        ArrayList<Student> list = new ArrayList<>();//利用标准JavaBeen创建一个学生类
        //添加一些学生对象
        Student s1 = new Student("zhangsan",21);
        Student s2 = new Student("lisi",22);
        Student s3 = new Student("wangwu",23);
        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //进行遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }


    }
}
