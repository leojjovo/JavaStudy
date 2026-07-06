import java.util.ArrayList;

//main方法中定义一个集合，存入三个对象

//要求:定义一个方法,根据id查找相应的用户信息
//用户属性为id,username,password
public class ArraylistDemo5 {
   public static void main(String[] args) {
        //main方法中定义一个集合，存入三个对象
        ArrayList<User> list = new ArrayList<>();
        //
        User u1 = new User("zhangsan","ok0001","123456aaa");
        User u2 = new User("lisi","ok0002","123456bbb");
        User u3 = new User("wangwu","ok0003","123456qwq");

        //把初始化好的对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用方法，并打印结果
        boolean result = contains(list,"ok0001");
        System.out.println(result);


    }
    //定义一个方法,根据id查找相应的用户信息
    public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size() ; i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return true;
            }

        }
        return false;
    }
}