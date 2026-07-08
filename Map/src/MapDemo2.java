import java.util.*;

public class MapDemo2 {
   public static void main(String[] args) {
       Map<String,String> m = new HashMap<>();
       m.put("张三","李四");
       m.put("张琪","王八");
       m.put("王五","梁九");
        //通过键找值
       //把获取到的所有键放到单列集合中
       //创建单列集合
      Set<String> keys = m.keySet();
       System.out.println("这是使用增强for来遍历出来的结果");
      for (String key : keys) {
           //System.out.println(key);
           String value = m.get(key);
           System.out.println(key + "=" + value);
       }
       System.out.println("这是利用迭代器遍历出来的结果");
       Iterator<String> it = keys.iterator();
       while (it.hasNext()) {
           String key = it.next();
           //System.out.println(key);
           String value = m.get(key);
           System.out.println(key +"=" + value );
       }
       System.out.println("这是利用lambda得出的");
       keys.forEach(key ->{
           String value = m.get(key);
           System.out.println(key + "=" + value);
       });
       System.out.println("这也是利用kambda得出来的（更加方便简单）");
       m.forEach((key,value) -> System.out.println(key + "=" + value));

    }
}
