import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
    int[] ans = {2,3,1,1};
    cycle(ans);
    System.out.println(Arrays.toString(ans));

    }
    static void cycle(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums , i , correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] ans , int first , int second){
        int temp = ans[first];
        ans[first] = ans[second];
        ans[second] = temp;
    }
}
