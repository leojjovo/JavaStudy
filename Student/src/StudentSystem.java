import java.util.ArrayList;
import java.util.Scanner;

//完成一个学生管理系统
//内容包括:
//-----------欢迎来到学生管理系统----------
//1.添加学生----> id唯一
//2.删除学生---->id存在的话删除,不存在时提示不存在,返回初始菜单
//3.修改学生---->id存在继修改信息,id不存在需要提示不存在并,返回初始菜单
//4.查询学生---->如果没有学生信息,提示如下:无当前学生信息,请添加后再查询,如果有该学生信息,需要安装以下格式输出
//5.退出
//请输入你的选择
public class StudentSystem {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Student> list = new ArrayList<>();
       while (true) {
           System.out.println("-----------欢迎来到学生管理系统----------");
           System.out.println("请输入你的选择：");
           System.out.println("1.添加学生");
           System.out.println("2.删除学生");
           System.out.println("3.修改学生");
           System.out.println("4.查询学生");
           System.out.println("5.退出");
           String choose = sc.next();
           switch (choose){
               case "1" -> addStudent(list);
               case "2" -> deleteStudent(list);
               case "3" -> updateStudent(list);
               case "4" -> queryStudent(list);
               case "5" -> {
                   System.out.println("已退出");
               System.exit(0);
               }
               default -> System.out.println("没有这个选项");
           }
       }
    }
    //添加学生
    public static void addStudent(ArrayList<Student> list){
       //利用空参初始化添加学生对象
       Student student = new Student();
       Scanner sc = new Scanner(System.in);
       String id = null;
        while (true){
            System.out.println("请输入你要添加的学生id");
            id = sc.next();
           boolean flag = contains(list,id);
            if (flag) {
                System.out.println("id已经存在，请重新输入");
            }else{
                student.setId(id);
                break;
            }
        }
        System.out.println("请输入学生名字：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入家庭住址：");
        String address = sc.next();
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        list.add(student);
        System.out.println("学生信息添加成功！");

    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
       //空参初始化学生
        Student student = new Student();
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id：");
        String id = sc.next();
        int index = getIndex(list,id);
        if (index >= 0) {
            list.remove(index);
        System.out.println( "id为" + id + "的学生删除成功！");
        }else{
            System.out.println("对不起，id不存在，请添加后再删除");
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> list){
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改学生的id");
        String id = sc.next();
        int index = getIndex(list,id);
        if (index == -1) {
            System.out.println("对不起，id不存在");
            return;
        }
        //运行到这里，说明id存在
        //接下来可以获取学生id然后进行修改
        Student student = list.get(index);
        System.out.println("请输入要修改的姓名：");
        String newName = sc.next();
        student.setName(newName);
        System.out.println("请输入你要修改的年龄：");
        int newAge = sc.nextInt();
        student.setAge(newAge);
        System.out.println("请输入你要修改的地址：");
        String newAddress = sc.next();
        student.setAddress(newAddress);
        System.out.println("修改成功");
    }
    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        if (list.size() == 0) {
            System.out.println("对不起，当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t名字\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }
    //判断id是否存在
    public static boolean contains(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String uid = stu.getId();
            if (uid.equals(id)) {
                //如果id存在，返回true
                return true;
            }
            //如果id不存在，返回false
        }return false;
    }
    //利用索引判断id是否存在
    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String uid = stu.getId();
            if (uid.equals(id)) {
                //如果id存在一样，返回索引
                return i;
            }
            //如果id不存在，返回-1
        }return -1;

    }
}
