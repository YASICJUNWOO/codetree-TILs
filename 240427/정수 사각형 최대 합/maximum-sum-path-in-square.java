import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr =new int[n][n];

        for(int i =0;i<n;i++){
            for(int j = 0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int idx = 1 ; idx < n;idx++){
            arr[0][idx] += arr[0][idx-1];
            arr[idx][0] += arr[idx][0];
        }

        for(int row = 1 ; row<n;row++){
            for(int col = 1 ; col<n;col++){
                arr[row][col] += Math.max(arr[row-1][col], arr[row][col-1]);
                //System.out.print(arr[row][col]+" ");
            }
            //System.out.println();
        }

        System.out.print(arr[n-1][n-1]);

    }
}