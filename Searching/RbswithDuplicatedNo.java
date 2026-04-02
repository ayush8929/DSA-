public class RbswithDuplicatedNo {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,3,5,9,4,1,0};
        int target = 2;
        int ans = searchTarget(arr, target);
        System.out.println(ans);
    }

    static int searchTarget(int[] arr , int target){
        int pivot = findPivotInDuplicated(arr);
        if(pivot == -1){
            return bianrySearch(arr , target , 0 , arr.length-1);
        }
        if(target == pivot){
            return pivot;
        }
        if(target >= arr[0]){
            return bianrySearch(arr , target , 0 , pivot-1);
        }else{
            return bianrySearch(arr , target, pivot+1, arr.length-1);
        }
    }

    static int bianrySearch(int[] arr , int target , int start , int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivotInDuplicated(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
