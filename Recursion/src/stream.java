public class stream {
    public static void main(String[] args) {
        System.out.println(skip("accadh"));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("a")){
            return skip(up.substring(1));
        }else{
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}
