public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,6};
        System.out.println(sortedOrNot(arr , 0));
    }
    public static boolean sortedOrNot(int[] arr , int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sortedOrNot(arr , index+1);
    }
}
