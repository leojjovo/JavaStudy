public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1= new Student("zhangsan",19);
        Student s2 = new Student("lisi",21);
        Student s3 = new Student("ww",22);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());


    }
}
