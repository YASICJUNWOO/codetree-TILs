import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), targetSum = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i = 1 ; i<=n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1 ; i<=n;i++){
            arr[i] += arr[i-1];
        }

        int cnt = 0;

        for(int i = 1 ; i<=n;i++){
            for(int j = i ;j<=n;j++){
                int gap = arr[j] - arr[i-1];

                if(gap>targetSum){
                    break;
                }

                if(gap==targetSum){
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}