import javax.swing.*;

public class try2 {
    static void main(String[] args) {
        double c1 =compare(0.5,7.0);
        double c2 = compare(7.0,0.5);
        if (c1 > c2) {
            System.out.println("第一个比第二个面积大");
        }else if (c1 < c2){
            System.out.println("第二个比第一个面积大");
        }
        else {
            System.out.println("两个长方形一样大");
        }

    }
    public static double compare(double len,double wid) {
        double sum = len * wid;
        return sum;

    }
}
