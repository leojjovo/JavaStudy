public class DemoString4 {
    static void main(String[] args) {
        String result = reverse("abcd");
        System.out.println(result);
    }
    public static String reverse(String str){
        String result  = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            char c = str.charAt(i);
            result = result + c;

            }
        return result;
        }
    }
