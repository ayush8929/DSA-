public class Ascii {
    public static void main(String[] args) {
        String value = "abcdefghijklmnopqrstuvwxyz";
        int i = 0;
        while(value.charAt(i) != 'z'){
            System.out.println(value.charAt(i) + 0);
            i++;
        }
    }
}
