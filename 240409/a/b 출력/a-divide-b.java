import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
    

        String result = a/b + ".";

        a %= b;

        int cnt = 20;
        while(cnt>0){
            a*=10;
            result += (a/b);
            a %= b;
            cnt--;
        }

        System.out.print(result);
    }
}