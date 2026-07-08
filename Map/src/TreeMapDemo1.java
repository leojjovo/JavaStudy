import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    static void main(String[] args) {
        //
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm.put(1,"粤利粤");
        tm.put(2,"雷碧");
        tm.put(3,"九个核桃");
        tm.put(4,"可恰可乐");
        System.out.println(tm);
    }
}
