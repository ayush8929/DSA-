public class ConvertsionTOBinary {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(convertToBinary(x));
    }
    static String convertToBinary(int x){
        String res = "";
        while(x > 0){
            if(x % 2 == 1){
                res += "1";
            }else{
                res += "0";
            }
            x = x/2;
        }

        return new StringBuilder(res).reverse().toString();
    }
}
