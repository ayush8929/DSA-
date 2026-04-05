import java.util.Arrays;

public class SmallerNmuber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbersThancurrent(nums);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] smallerNumbersThancurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
                arr[i] = count;
            }
        }
        return arr;
    }
}