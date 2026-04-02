import java.util.Arrays;

public class productOfArray {
    public productOfArray(int[] nums) {
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] answer = productExceptSelf(nums);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = 1;
            for(int j = 0 ; j<nums.length ; j++){
                if(i != j){
                    ans[i] *= nums[j];
                }
            }
        }
        return ans;
    }
}
