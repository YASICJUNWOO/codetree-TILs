import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        String str1 = sc.next(), str2 = sc.next();

        String checkStr = str1;

        int lastIdx = checkStr.length()-1;

        while(true){
            checkStr = checkStr.substring(lastIdx) + checkStr.substring(0,lastIdx);
            cnt++;

            if(checkStr.equals(str2)){
                System.out.print(cnt);
                break;
            }

            if(checkStr.equals(str1)){
                System.out.print(-1);
                break;
            }
        }
    }
}