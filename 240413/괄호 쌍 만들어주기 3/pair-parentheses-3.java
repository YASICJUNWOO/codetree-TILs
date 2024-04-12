import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int sum = 0;

        for(int i =0;i<str.length();i++){
            sum += cal(str, i);
        }

        System.out.print(sum);
    }

    public static int cal(String str, int target){

        int cnt = 0;

        char ch = str.charAt(target);
        if(ch ==')'){
            return cnt;
        }

        for(int i = target+1;i<str.length();i++){
            if(str.charAt(i) != ch){
                cnt++;
            }
        }

        return cnt;
    }
}