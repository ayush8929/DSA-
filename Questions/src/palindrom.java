public class palindrom {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x){
        int n = 0;
        if(x < 0){
            return false;
        }
        int original = x;
        while(x > 0){
            int lastdigit = x % 10;
            n = (n*10) + lastdigit;
            x = x/10;
        }
        if(n == original){
            return true;
        }
        return false;
    }
}
