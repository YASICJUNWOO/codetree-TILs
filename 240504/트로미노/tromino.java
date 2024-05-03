import java.util.*;

public class Main {
    
    static int rowSize = 0, colSize = 0;
    static int[][] arr;
    static int[][] dp;
    static int max = -1;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        rowSize = sc.nextInt();
        colSize = sc.nextInt();
        arr = new int[rowSize+1][colSize+1];
        dp = new int[rowSize+1][colSize+1];


        for(int  row = 1; row<=rowSize; row++){
            for(int col = 1;col<=colSize; col++){
                arr[row][col] = sc.nextInt(); 
                dp[row][col] = arr[row][col] + dp[row-1][col] + dp[row][col-1] - dp[row-1][col-1];
            }
        }

        first();
        second();
        System.out.print(max);

    }

    public static void first(){
        for(int  row = 2; row<=rowSize; row++){
            for(int col = 2;col<=colSize; col++){
                int sum = dp[row][col] - dp[row-2][col] - dp[row][col-2] + dp[row-2][col-2];
                int min = findMin(row,col);
                //System.out.println(sum-min);
                max = Math.max(max, sum-min);
            }
        }
    }

    public static void second(){
        for(int  row = 3; row<=rowSize; row++){
            for(int col = 1;col<=colSize; col++){
                int sum = dp[row][col] - dp[row-3][col] - dp[row][col-1] + dp[row-3][col-1];
                
                max = Math.max(max, sum);
            }
        }

        for(int  row = 1; row<=rowSize; row++){
            for(int col = 3;col<=colSize; col++){
                int sum = dp[row][col] - dp[row-1][col] - dp[row][col-3] + dp[row-1][col-3];
                
                max = Math.max(max, sum);
            }
        }
    }

    public static int findMin(int row, int col){
        int min = arr[row][col];
        min = Math.min(min,arr[row-1][col-1]);
        min = Math.min(min,arr[row][col-1]);
        min = Math.min(min,arr[row-1][col]);

        return min;
    }
}