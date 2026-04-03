public class maxZerosFlip {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(Maxflip(nums , k));
    }
    public static int Maxflip(int[] nums , int k){
        int maxlen = 0;
        for(int i = 0 ; i<nums.length ; i++){
            int zeros = 0;
            for(int j = i ; j<nums.length ; j++){
                if(nums[j] == 0){
                    zeros++;
                }
                if(zeros <= k){
                    int len = j - i + 1;
                    maxlen = Math.max(maxlen , len);
                }else{
                    break;
                }
            }
        }
        return maxlen;
    }
}
