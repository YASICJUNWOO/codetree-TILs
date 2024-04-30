import java.util.*;

public class Main {

    static long MODENUM = 1000000007;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int  n = sc.nextInt();

        long[] dp = new long[1001];

        dp[1] = 2;
        dp[2] = 7;

        for(int i = 3 ; i<=n;i++){
            dp[i] = (dp[i-1]*2+1 + (dp[i-2]*4)-1) ;
        }
        
        System.out.print(dp[n] % MODENUM);
    }
}