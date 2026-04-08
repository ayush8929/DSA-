import java.util.ArrayList;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,7,6};
        System.out.println(sortedOrNot(arr , 0));
//        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(sortedAllIndex(arr , 4, 0 , new ArrayList<>()));

    }
    public static boolean sortedOrNot(int[] arr , int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sortedOrNot(arr , index+1);
    }
    static ArrayList<Integer> sortedAllIndex(int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length - 1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return sortedAllIndex(arr , target , index+1, list);
    }
}
