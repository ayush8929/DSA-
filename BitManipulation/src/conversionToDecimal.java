public class conversionToDecimal {
    public static void main(String[] args) {
        String x = "111";
        System.out.println(convertToDecimal(x));
    }
    static int convertToDecimal(String x){
        int len = x.length() , p2 = 1 , num = 0;
        for(int i = len-1 ; i >= 0 ; i--){
            if(x.charAt(i) == '1'){
                num = num + p2;
            }
            p2 = p2 * 2;
        }
        return num;
    }
}
