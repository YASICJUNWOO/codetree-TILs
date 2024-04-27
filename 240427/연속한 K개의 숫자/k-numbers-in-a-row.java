import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner  sc  =new Scanner(System.in);

        //0의 개수를 세자
        int size = sc.nextInt(), num = sc.nextInt(), minus = sc.nextInt();

        int[] arr = new int[size+1];
        int[] dp = new int[size+1];

        for(int i = 0 ; i<minus; i++){
            int sub = sc.nextInt();
            arr[sub] = -1;
        }

        for(int i = 1 ; i<=size; i++){

            if(arr[i] == -1){
                dp[i] = dp[i-1] +1;
            }
            else{
                dp[i] = dp[i-1];
            }

            //System.out.println(dp[i]);

        }

        int min = 1000000;

        for(int i = num; i<=size;i++){
            int count = dp[i]-dp[i-num];
            //System.out.println(count);
            if(min>count){
                min = count;
            }
        }

        System.out.print(min);

    }
}