import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    //Map的第二种遍历方式:通过键值对对象进行遍历
    static void main(String[] args) {
        //创建Map集合
        Map<String,String> m = new HashMap<>();
        m.put("标枪选手","马超");
        m.put("人物挂件","明世隐");
        m.put("御龙骑士","尹志平");
        //通过一个方法获取所有的键值对对象
        Set<Map.Entry<String,String>> entries = m.entrySet();
        //利用增强for遍历
        System.out.println("这是利用增强for得出的");
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("这是两个迭代器得出的");
        Iterator<Map.Entry<String,String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("这是利用lambda得出的");
        entries.forEach(entry -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        } );
            System.out.println("这是利用lambda得出的(这种更便利)");
        m.forEach((key,value) ->{
            System.out.println(key + "=" + value);
        });
    }

}
