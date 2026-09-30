public class recurrsiveBs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 0, arr.length-1, 8));
    }
    public static int search(int[] arr, int low , int high , int target){
        if(low > high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target){
            return search(arr, mid + 1, high, target);
        }
        return search(arr , low , mid - 1, target);
    }
}
