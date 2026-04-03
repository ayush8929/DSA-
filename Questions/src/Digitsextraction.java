
public class Digitsextraction {
    public static void main(String[] args) {
        int n = 234;
//        sumAndMul(n);
        System.out.println(sumAndMul(n));
    }
    static int sumAndMul(int n){
        int sum = 0;
        int mul = 1;
        while(n>0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            mul = mul * lastdigit;
            n = n/10;
        }
        int ans = mul - sum;
        return ans;
    }
}