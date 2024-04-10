import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(), target = sc.next();

        int result = str1.indexOf(target);

        System.out.print(result != -1 ? result : -1);
    }
}