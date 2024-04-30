import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        for(int row = 0 ; row<size;row++){
            for(int col = 0 ; col<size;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row = 1;row<size;row++){
            arr[row][size-1] += arr[row-1][size-1];
        }
        for(int col = size-2 ; col>=0;col--){
            arr[0][col] += arr[0][col+1];
        }

        for(int row = 1 ; row<size;row++){
            for(int col = size-2 ; col>=0;col--){
                arr[row][col] += Math.min(arr[row-1][col], arr[row][col+1]);
            }
        }

        System.out.print(arr[size-1][0]);
    }
}