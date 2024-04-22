import java.util.*;

public class Main {

    static int size = 0;
    static int[][] map;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        map = new int[size][size];

        for(int i = 0 ;i< size;i++){
            for(int j = 0; j< size;j++){
                map[i][j] = sc.nextInt();
            }
        }

        int maxCnt = Integer.MIN_VALUE;

        for(int i = 0 ;i< size;i++){
            for(int j = 0; j< size - 2;j++){
                maxCnt = Math.max(maxCnt, map[i][j]+map[i][j+1]+map[i][j+2]);
            }
        }

        System.out.print(maxCnt);

    }
}