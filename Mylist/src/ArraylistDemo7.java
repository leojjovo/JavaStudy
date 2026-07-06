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
public class ArraylistDemo7 {
    static void main(String[] args) {
        System.out.println("------------回欢来到学生管理系统-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择您的操作");
        String choose = sc.next();
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");
        while (true){
            switch (choose) {
                case "1" -> addStudent();
                case "2" -> removeStudent();
                case "3" -> setStudent();
                case "4" -> getStudent();
                case "5" -> System.exit(0);
                default -> System.out.println("没有这个选项 ");


            }
        }
    }
    public static void addStudent(){
        System.out.println("1.添加学生");
    }
    public static void removeStudent(){
        System.out.println("2.删除学生");
    }
    public static void setStudent(){
        System.out.println("3.修改学生");
    }
    public static void getStudent(){
        System.out.println("4.查询学生");
    }
}
