import java.util.TreeSet;

public class TreeSetDemo2 {
   public static void main(String[] args) {
       /*
       需求：创建五个学生对象
       属性：（姓名，年龄，语文成绩，数学成绩，英语成绩）
       按照总分从高到低输出到控制台
       如果总分一样按照语文成绩排
       如果语文一样，按照数学成绩排
       如果数学成绩一样，按照英语成绩排
       如果英语也一样，按照年龄排
       如果年龄也一样，按照姓名的字母顺序排
       如果都一样，认为是同一个人，不存
        */
       //创建学生对象
       Student2 S1 = new Student2("zhangsan",23,90,80,60);
       Student2 S2 = new Student2("lisi",24,80,70,60);
       Student2 S3 = new Student2("wangwu",24,60,70,80);
       Student2 S4 = new Student2("zhaoliu",25,70,80,80);
       Student2 S5 = new Student2("qianqi",26,60,50,90);
       //创建集合
       TreeSet<Student2> ts = new TreeSet<>();
       ts.add(S1);
       ts.add(S2);
       ts.add(S3);
       ts.add(S4);
       ts.add(S5);
       for (Student2 t : ts) {
           System.out.println(t);
       }

    }
}
