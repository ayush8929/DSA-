public class Binaryfloor {
    public static void main(String[] args) {
        int[] arr = {1,2,6,8,9,10,15,20};
        int target = 7;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr , int target){
        if(target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
