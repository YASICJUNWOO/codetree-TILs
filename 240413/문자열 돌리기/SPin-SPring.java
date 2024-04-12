import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length();

        for(int i =0;i<=len;i++){
            System.out.println(str);
            str = str.substring(len-1) + str.substring(0,len-1);
        }
    }
}