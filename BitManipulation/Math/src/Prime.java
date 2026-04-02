public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(91));
    }
    static boolean prime(int n){
        int i = 2;
        while(i * i <= n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}