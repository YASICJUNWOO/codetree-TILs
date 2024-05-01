import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1];

        int maxVal = Integer.MIN_VALUE;

        for(int i = 1 ; i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1 ; i<n;i++){
            arr[i] = Math.max(arr[i], arr[i-1] + arr[i]);
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }

        System.out.print(maxVal);
    }
}