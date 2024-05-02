import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int coinSize = sc.nextInt(), money = sc.nextInt();

        int[] coins = new int[coinSize];
        int[] dp = new int[money+1];

        for(int i = 0; i< coinSize ; i++){
            coins[i] = sc.nextInt();
        }

        for(int i = 1 ; i<=money ; i++){

            int min = 10001;

            for(int j = 0 ; j<coinSize ; j++){
                if(i >= coins[j]){
                    min = Math.min(min, dp[i-coins[j]]);
                }
            }

            dp[i] = min+1;
            //System.out.println(dp[i]);
        }

        System.out.print(dp[money] >= 10001 ? -1 : dp[money]);
    }
}