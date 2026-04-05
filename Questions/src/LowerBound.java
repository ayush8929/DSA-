public class LowerBound {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,3,7,8,9,9,11};
//        int target = 12;
//        System.out.println(search(arr , target));
        int[] nums = {0};
        System.out.println(containsDuplicate(nums));
    }
//    public static int search(int[] arr , int target){
//        int start = 0 , end = arr.length - 1;
//        int ans = arr.length;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(arr[mid] >= target){
//                ans = mid;
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return ans;
//    }

    public static boolean containsDuplicate(int[] nums) {
        int right = nums.length - 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != nums[right]){
                right--;
            }else{
                return true;
            }
        }
        return false;
    }
}
