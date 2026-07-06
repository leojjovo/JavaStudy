import java.util.ArrayList;

//定义一个集合，添加字符串，并进行遍历，
// 遍历输出格式参照：[元素1，元素2，元素3]
public class ArraylistDemo2 {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList<String> list = new ArrayList<>();
        //添加字符串
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.print("[");
        //进行遍历
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }

}
