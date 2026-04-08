public class leftRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int[] result = leftRotate(arr);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    public static int[] leftRotate(int[] arr){
        int temp = arr[0];
        for(int i = 1; i<arr.length ; i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
