import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
     public static void main(String[] args) {
         /*V put(K key,V value)                   添加元素
           V remove (Object key)                  根据键删除键值对元素
           void clear()                           移除所有的键值对元素
           boolean containKey(Object key)         判断集合是否包含指定的键
           boolean containsValue(Object value)    判断计划和是否包含指定的值
           boolean isEmpty()                      判断集合是否为空
           int size                               集合的长度，也就是集合中键值对的个数
          */
         //创建Map集合对象
         Map<String,String> m = new HashMap<>();
         //1.添加元素
         m.put("张三","李四");
         String value1 = m.put("王五","李六");
         m.put("张琪","王八");

         //put方法的细节:
         //在添加数据的时候，如果键存在，那么直接把键值对对象添加到Map集合当中，方法就会把被覆盖的进行 返回
         //在添加数据的时候，如果键存在，那么直接把键值对对象添加到Map集合当中，方法返回Null

         String value = m.put("张三","梁九");
         System.out.println(value);
         System.out.println(value1);
         //2.删除元素
         //m.remove("张琪");
         System.out.println(m);
         //判断是否包含键
         boolean keyResult = m.containsKey("张琪");
         System.out.println(keyResult);
         //判断是否包含值
         boolean value3 = m.containsValue("李六");
         System.out.println(value3);
         //一键清空
         m.clear();
         //元素长度查询
         int longsize = m.size();
         System.out.println(longsize);


         //打印集合
         System.out.println(m);



    }
}
