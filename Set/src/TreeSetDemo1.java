import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
   public static void main(String[] args) {
       /*
       需求：选择比较器排序和自然排序两种方式
       要求：存入四个字符串 “c”，“ab”，“df”，“qwer”
       按照长度排序，如果一样长则 按照首字母排序
      */
       //创建集合
       //加入比较器接口
       //这种方法是自定义创建集合时，定义Comparator比较器对象，指定比较规则
    TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            int i = o1.length() - o2.length();
            i = i == 0? o1.compareTo(o2) : i;
            return i;
        }
    });
    //添加元素
       ts.add("c");
       ts.add("ad");
       ts.add("df");
       ts.add("qwer");
       //打印集合
       System.out.println(ts);

}
}