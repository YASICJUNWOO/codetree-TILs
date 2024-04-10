import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int idx = str.indexOf("e");

        String result = str.substring(0,idx)+str.substring(idx+1);

        System.out.print(result);
    }
}