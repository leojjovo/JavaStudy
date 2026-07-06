import java.util.ArrayList;


//boolean add(E e) 添加
//boolean remove(E e) 删除
//E set(int index,E e) 修改
//E get(int index) 查询
//int size() 查询长度


public class ArraylistDemo1 {
    public static void main(String[] args) {
        //定义集合的格式
        ArrayList<String> list = new ArrayList<>();
        //增加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        //删减
        list.remove("aaa");
        System.out.println(list);
        //修改
        list.set(2,"fff");
        System.out.println(list);
        //查询
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //用一个变量去接收集合的索引
            String str = list.get(i);
            //打印变量即可
            System.out.println(str);
        }


    }
}
