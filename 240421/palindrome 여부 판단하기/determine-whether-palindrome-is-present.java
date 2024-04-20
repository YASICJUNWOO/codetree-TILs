import java.util.*;

public class Main {

    public static int len  = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        len = str.length();

        System.out.print( isPal(str) ? "Yes" : "No");

    }

    public static boolean isPal(String str){

        for(int i = 0; i<len/2 ; i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                return false;
            }
        }

        return true;
    }
}