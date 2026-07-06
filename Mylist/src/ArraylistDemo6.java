import java.util.ArrayList;

//定义Javabean类：Phone
//Phone属性：品牌，价格
//main方法中定义一个集合，存入三个手机对象
//分别为：小米，1000 苹果，8000 锤子，2999
//定义一个方法，将价格低于3000的手机信息返回
public class ArraylistDemo6 {
    static void main(String[] args) {
        //main方法中定义一个集合，存入三个手机对象
        //分别为：小米，1000 苹果，8000 锤子，2999
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子" ,2999);

        //添加对象进集合
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //调用方法getPhoneInfo
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);
        //遍历集合并打印结果
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + "," + phone.getPrice());

        }

    }
    //定义一个方法，将价格低于3000的手机信息返回
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个集合用来存储价格低于3000的手机对象
        ArrayList<Phone> resultList = new ArrayList<>();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Phone p =  list.get(i);
            int price = p.getPrice();
            if (price < 3000) {
                resultList.add(p);


            }

        }
        return resultList;

    }


}
