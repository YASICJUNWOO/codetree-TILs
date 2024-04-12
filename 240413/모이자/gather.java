import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i <n;i++){
            int cnt = cal(arr, i);
            if(cnt<min){
                min = cnt;
            }
        }

        System.out.print(min);
    }

    public static int cal(int[] arr,int target){

        int cnt = 0;

        for(int i =0;i<arr.length;i++){
            if(i == target){
                continue;
            }

            if(i<target){
                cnt += arr[i]*(target-i);
            }
            else{
                cnt += arr[i]*(i-target);
            }
        }

        return cnt;
    }
}