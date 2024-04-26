import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i =1;i<=n;i++){
            arr[i] =sc.nextInt();
        }

        for(int i =1;i<=n;i++){
            arr[i] += arr[i-1];
        }
        


        int max = 0;
        for(int i = k ; i<=n;i++){
            int gap = arr[i]-arr[i-k];
            max = Math.max(gap,max);
        }

        System.out.print(max);
    }
}