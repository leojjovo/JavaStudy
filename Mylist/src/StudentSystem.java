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
       ArrayList<StudentSBean> list = new ArrayList<>();
       loop: while (true){
           System.out.println("---------欢迎来到学生管理系统----------");
          System.out.println("请输入您的选择");
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

    public static void addStudent(ArrayList<StudentSBean> list) {
         StudentSBean s = new StudentSBean();
        Scanner sc = new Scanner(System.in);
        String id = null;
       while (true) {
            System.out.println("请输入学生id：");
            id = sc.next();
            //
            boolean flag1 = contains1(list, id);
            if(flag1){
                //
                System.out.println("id已经存在！请重新输入");
            }else{
                //
                s.setId(id);
                break;

       }
       }
        System.out.println("请输入添加学生名字：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的家庭住址：");
        String address = sc.next();
        //
        s.setAge(age);
        s.setName(name);
        s.setAddress(address);

        list.add(s);
        //
        System.out.println("学生信息添加成功!");

    }
    //
    public static void updateStudent(ArrayList<StudentSBean> list){
        Scanner sc = new Scanner(System.in);
        //利用下面的getIndex方法来判断id是否存在
            System.out.println("请输入要修改的id");
            String id = sc.next();
            int index = getIndex(list,id);
            if (index == -1) {
                System.out.println("对不起，id不存在！");
                return;
            }
            //执行到这里，说明id存在
            //获取修改学生对象
            StudentSBean stu = list.get(index);
            //输入信息并修改
        System.out.println("请输入要修改的姓名：");
        String newName = sc.next();
        stu.setName(newName);;
        System.out.println("请输入你要修改的年龄：");
        int newAge = sc.nextInt();
        stu.setAge(newAge);
        System.out.println("请输入你要修改的家庭住址:");
        String newAddress = sc.next();
        stu.setAddress(newAddress);
        System.out.println("修改成功！");
    }
    //
    public static void deleteStudent(ArrayList<StudentSBean> list){
        //空参
        StudentSBean s = new StudentSBean();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生id");
           String id = sc.next();
            int index = getIndex(list,id);
            if (index >= 0) {
                list.remove(index);
                System.out.println("id为" + id +"的学生删除成功！");
            }else {
                System.out.println("无该id,请录入后重新删除，请重新输入你要删的学生id");
            }
        }



    //
    public static void queryStudent(ArrayList<StudentSBean> list){
        System.out.println("查询学生 ");
        //
        if (list.size() == 0){
            System.out.println("对不起，当前无学生信息，请添加后再查询");
            return;
        }
        //如果有学生信息，将会运行以下
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            StudentSBean stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());

        }

    }
    //
    public static boolean contains1(ArrayList<StudentSBean> list , String id){
       //
        for (int i = 0; i < list.size(); i++) {
            StudentSBean stu = list.get(i);
            String sid = stu.getId();
            //
            if(sid.equals(id)) {
                return true;
                //
            }
        }
        //
        return false;
    }
    public static int getIndex(ArrayList<StudentSBean> list , String id){
        for (int i = 0; i < list.size(); i++) {
            StudentSBean stu = list.get(i);
            String sid  = stu.getId();
            if (sid.equals(id)) {
                //如果是一样的，那就返回索引
                return i;
            }

        }
        //当循环没有找到，就表示不存在，返回-1
        return -1;
    }
}
