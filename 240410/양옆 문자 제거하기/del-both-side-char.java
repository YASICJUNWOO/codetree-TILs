import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int idx = str.length()-1;

        String result = str.substring(0,1) + str.substring(2,idx-1) + str.substring(idx);

        System.out.print(result);
    }
}