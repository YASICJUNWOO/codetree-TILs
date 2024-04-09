import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = n;

        int sumValue = 0;

        while(n-->0){
            int input =sc.nextInt();
            sumValue += input;
        }

        System.out.printf("%d %.1f",sumValue, sumValue/(double)cnt);
    }
}