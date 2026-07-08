import java.lang.classfile.instruction.BranchInstruction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("标枪选手","马超");
        m.put("人物挂件","明世隐");
        m.put("御龙骑士","尹志平");
        //第三种遍历方式:直接利用lambda表达式遍历
        //通过lambda表达式直接遍历得到每一个Map集合的键值对元素
        m.forEach((key,value)-> System.out.println(key + "=" + value) );
    }
}
