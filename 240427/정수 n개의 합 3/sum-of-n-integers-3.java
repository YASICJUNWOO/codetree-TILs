import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(), k = sc.nextInt();

        int[][] arr = new int[size+1][size+1];

        for(int i =1;i<=size;i++){
            for(int j = 1;j<=size;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =1;i<=size;i++){
            for(int j = 1;j<=size;j++){
                arr[i][j] += arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1] ;
                //System.out.print(arr[i][j]+" ");
            }
            //System.out.println();
        }

        int result = 0;
        for(int i =k;i<=size;i++){
            for(int j = k;j<=size;j++){
                int sum = arr[i][j] - arr[i-k][j] - arr[i][j-k] + arr[i-k][j-k];

                //System.out.println(i+" "+j+"에서 "+sum);

                if(sum > result){
                    result = sum;
                }
            }
        }

        System.out.print(result);
    }
}