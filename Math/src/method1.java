import com.sun.jdi.PathSearchingVirtualMachine;

public class method1 {
   public static void main(String[] args) {
       getLength(1.5);
}
public static void getLength(double r){
       double resilt = 3.14 * r * r;
       System.out.println(resilt);

}
}