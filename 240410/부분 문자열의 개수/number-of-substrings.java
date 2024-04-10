import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(), str2 = sc.next();

        int checkLength = str2.length();

        int cnt = 0;

        for(int i = 0;i<str1.length()-checkLength-1 ;i++){
            String checkStr = str1.substring(i,i+checkLength);


            if(checkStr.equals(str2)){
                cnt++;
            }
        } 

        System.out.print(cnt);
    }
}