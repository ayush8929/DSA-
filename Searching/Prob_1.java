import java.util.*;

public class Prob_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search : ");
        int target = sc.nextInt();

        int ans = search(arr, target);
        System.out.println("Element is found at : " + ans);
    }
    static int search(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<arr.length ; i++){
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }
}