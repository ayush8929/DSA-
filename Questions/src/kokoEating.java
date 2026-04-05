import java.util.Arrays;
import java.util.*;

public class kokoEating {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles , h));
    }
    public static int minEatingSpeed(int[] piles , int h){
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int low = 1 , high = maxPile;
        int ans = maxPile;
        while (low <= high){
            int mid = low + (high - low)/2;
            int totalHr = calculateTotalHours(piles , mid);
            if(totalHr <= h){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int calculateTotalHours(int[] piles , int speed){
        int totalH = 0;
        for(int banana : piles){
            totalH += (int)Math.ceil((double)banana/speed);
        }
        return totalH;
    }
}
