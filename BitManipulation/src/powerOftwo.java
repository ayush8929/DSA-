public class powerOftwo {
    public static void main(String[] args) {
        int n = 8;
        boolean ans = false;
        if((n & (n-1)) == 0){
            ans = true;
        }
        System.out.println(ans);
    }
}
