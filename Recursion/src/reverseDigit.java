public class reverseDigit {
    static int sum = 0;

    static void reverse(int n){
        if(n == 0){
            return;
        }
        int res = n%10;
        sum = sum*10 + res;
        reverse(n/10);
    }
    public static void main(String[] args) {
        reverse(12453);
        System.out.println(sum);
    }
}
