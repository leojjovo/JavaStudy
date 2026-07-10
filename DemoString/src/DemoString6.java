public class DemoString6 {
    static void main(String[] args) {
        String phoneNumber = "13226906666";
        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}