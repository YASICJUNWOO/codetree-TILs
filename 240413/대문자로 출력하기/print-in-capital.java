import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[]  arr = str.toCharArray();

        for(int i =0;i<str.length();i++){
            char ch = arr[i];

            if(ch>='a' && ch<='z'){
                System.out.print((char)(arr[i]-'a'+'A'));
            }
            else if(ch>='A'&& ch<='Z'){
                System.out.print(arr[i]);
            }
        }

        
    }
}