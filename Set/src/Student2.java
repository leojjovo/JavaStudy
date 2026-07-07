//这是TreeSstDemo2利用的
public class Student2 implements Comparable<Student2> {
    //姓名
    private String name;
    //年龄
    private  int age;
    //语文成绩
    private int Chinese;
    //数学成绩
    private int Math;
    //英语成绩
    private int English;
    //空参
    public Student2(){}
    //形参
    public Student2(String name,int age,int Chinese,int Math,int English){
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                '}';
    }
//按照总分从高到低输出到控制台
//如果总分一样按照语文成绩排
//如果语文一样，按照数学成绩排
//如果数学成绩一样，按照英语成绩排
//如果英语也一样，按照年龄排
//如果年龄也一样，按照姓名的字母顺序排
//如果都一样，认为是同一个人，不存
    //这种方法是javabean类实现Comparable接口指定比较规则
    @Override
    public int compareTo(Student2 o) {
        int sum1 = this.getChinese() + this.getMath() + this.getEnglish();
         int sum2 = o.getChinese() + o.getMath() + o.getEnglish();
         int i = sum1 - sum2;
         //如果总分一样按照语文成绩排
        i = i == 0? this.getChinese() - o.getChinese() : i;
        //如果语文一样，按照数学成绩排
        i = i== 0? this.getMath() - o.getMath() : i;
        //如果数学成绩一样，按照英语成绩排
        i = i == 0? this.getEnglish() - o.getEnglish() : i;
        //如果英语也一样，按照年龄排
        i = i == 0? this.getAge() - o.getAge() : i;
        //如果年龄也一样，按照姓名的字母顺序排
        i = i == 0? this.getName().compareTo(o.getName()):i;
        return i;
    }
}
