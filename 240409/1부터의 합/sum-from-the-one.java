import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sumVal= 0;
        int answer = 0;

        for(int i = 1;i<=n;i++){
            sumVal+=i;
            if(sumVal>=n){
                answer =i;
                break;
            }
        }

        System.out.print(answer);
    }
}