import java.io.PrintStream;

public class try3 {
    public static void main(String[] args) {
        long x1 = 10;
        long x2 = 10;
        compare(x1,x2);

    }
    //用相同方法名得方法重构
    public static void  compare(int a1,int a2){
        System.out.println("int");
       System.out.println(a1 == a2);
    }
    public static void compare(short b1,short b2){
        System.out.println("short");
        System.out.println(b1 == b2);
    }
    public static void compare(byte c1,byte c2){
        System.out.println("byte");
        System.out.println(c1 == c2);
    }
    public static void compare(long d1,long d2){
        System.out.println("long");
        System.out.println(d1 == d2);

    }
}

