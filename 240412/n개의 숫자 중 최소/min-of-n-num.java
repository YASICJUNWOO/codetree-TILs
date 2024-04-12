import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

        final int MIN_VAL = Integer.MIN_VALUE;
        final int MAX_VAL = Integer.MAX_VALUE;

        int min = MAX_VAL;
        int max = MIN_VAL;

        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min  = arr[i];
            }
        }

        int minCnt = 0;
        int maxCnt = 0;

        for(int i = 0 ;i<n ;i++){
            if( arr[i] == min){
                minCnt++;
            }
            if(arr[i] == max){
                maxCnt++;
            }
        }

        System.out.print(min+" "+minCnt);
    }
}