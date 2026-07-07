import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    /*Set系列集合特点
    无序性，添加元素和打印元素的顺序可能不一样
    唯一性，添加元素唯一，不重复
    无索引，不可以用索引遍历得到
     */

     public static void main() {
         //创建Set集合对象
        Set<String> s = new HashSet<>();
        //添加元素测试，用布尔类型变量接收尝试是否添加成功验证Set集合特点
        boolean r1 = s.add("张三");
         boolean r2 = s.add("李四");
         boolean r3 = s.add("李四");
         System.out.println(s);
         System.out.println(r1);
         System.out.println(r2);
         System.out.println(r3);//r3的输出结果为fasle说明添加失败，说明上方有相同元素，导致无法添加
         //下面尝试用三种遍历方法得到Set集合里面的元素
         //1.增加for
         System.out.println("这里是利用增强for遍历出来的结果");
         for (String str : s) {
             System.out.println(str);
         }
         System.out.println("这里是利用迭代器遍历出来的结果");

         Iterator<String> it = s.iterator();
         while (it.hasNext()){
             String str = it.next();
             System.out.println(str);
         }
         System.out.println("这里是利用lambda遍历出来的结果");
         s.forEach(str -> System.out.println(str));





    }
}
