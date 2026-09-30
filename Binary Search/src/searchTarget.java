public class searchTarget {
    public static void main(String[] args) {
        int[] arr = {1,8,9,11,22,33,55,66,77,88,99};
        search(arr,8);
    }
    static void search(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
