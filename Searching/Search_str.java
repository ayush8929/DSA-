import java.util.Scanner;

public class Search_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();

        System.out.print("Enter the character you want to search : ");
        char target = sc.next().charAt(0);

        System.out.print(search(str, target));
    }
    static int search(String str , char target){
        if(str.length() == 0){
            return -1;
        }
        for(int i = 0 ; i < str.length() ; i++){
            if(target == str.charAt(i)){
                return  i;
            }
        }
        return -1;
    }
}
