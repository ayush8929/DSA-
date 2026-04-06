public class removeDuplSortedArr {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDup(nums));
    }
    public static int removeDup(int[] nums){
        int i = 0;
        for(int j = 1; j<nums.length ; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
