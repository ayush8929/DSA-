public class maxPoints {
    public static void main(String[] args) {
        int[] nums = {6,2,3,4,7,2,1,7,1};
        int n = 4;
        System.out.println(max(nums , n));
    }
    public static int max(int[] nums , int n){
        int lsum = 0 , rsum = 0;
        int maxsum = 0;
        for(int i = 0 ; i<n ; i++){
            lsum = lsum + nums[i];
            maxsum = lsum;
        }
        int rightindex = nums.length - 1;
        for(int i = n-1 ; i>=0 ; i--){
            lsum = lsum - nums[i];
            rsum = rsum + nums[rightindex];
            rightindex--;
            maxsum = Math.max(maxsum , lsum + rsum);
        }
        return maxsum;
    }
}
