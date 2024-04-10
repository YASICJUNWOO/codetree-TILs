import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        String str1 = sc.next(), str2 = sc.next();

        boolean isContain = str1.contains(str2);

        int offset = str2.length();

        while(isContain){
            int idx = str1.indexOf(str2);
            String result = str1.substring(0,idx)+str1.substring(idx+offset);
            str1 = result;
            isContain = str1.contains(str2);
        }

        System.out.print(str1);
    }
}