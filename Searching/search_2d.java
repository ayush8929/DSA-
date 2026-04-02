import java.util.Arrays;
import java.util.Scanner;

public class search_2d{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row : ");
        int n = sc.nextInt();
        System.out.print("Enter the size of column : ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.print("Enter the elements of the array : ");

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number you want to search : ");
        int target = sc.nextInt();
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int target){
        for(int a = 0; a<arr.length ; a++){
            for(int b = 0 ; b < arr[a].length ; b++){
                if(target == arr[a][b]){
                    return new int[]{a,b};
                }
            }
        }
        return new int[]{-1,-1};
    }
}