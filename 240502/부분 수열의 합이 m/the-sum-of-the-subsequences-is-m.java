import java.util.*;

public class Main {

    static int[] dp;
    static int target = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int coinSize = sc.nextInt();
        target = sc.nextInt();

        dp = new int[target+1];
        int[] coins= new int[coinSize];

        init();

        for(int i = 0 ; i<coinSize;i++){
            coins[i] = sc.nextInt();
        }

        for(int i = 0 ; i<coinSize;i++){
            
            int coin = coins[i];

            for(int j = target ; j>=1 ; j--){

                if(j<coin || dp[j-coin] == Integer.MAX_VALUE){
                    continue;
                }

                dp[j] = Math.min(dp[j], dp[j-coin] + 1);
            }

            //print();
        }

        System.out.print(dp[target] == Integer.MAX_VALUE ? -1 : dp[target]);

    }

    public static void init(){
        for(int i = 1 ; i<=target ; i++){
            dp[i] = Integer.MAX_VALUE;
        }
    }

    public static void print(){
        for(int i = 1 ;i<=target;i++){
            System.out.print(dp[i]+" " );
        }
        System.out.println();
    }
}