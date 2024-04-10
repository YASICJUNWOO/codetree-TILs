import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(), str2 = sc.next();

        String result = str1.substring(0,2) + str2.substring(2);

        System.out.print(result);
    }
}