public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12 , 165 , 1589 , 163589};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digit(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digit2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    static int digit(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
