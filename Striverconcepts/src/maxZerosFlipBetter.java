public class maxZerosFlipBetter {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(Maxflip(nums , k));
    }
    public static int Maxflip(int[] nums , int k){
        int maxlen=0 , l=0 , r=0 , zeros=0;
        while(r<nums.length){
            if(nums[r] == 0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                int len = r-l+1;
                maxlen = Math.max(maxlen , len);
            }
            r++;
        }
        return maxlen;
    }
}
