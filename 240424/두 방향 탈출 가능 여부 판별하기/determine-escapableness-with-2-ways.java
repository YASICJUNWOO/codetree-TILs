import java.util.*;

public class Main {

    static int[][] map;
    static int rowSize = 0, colSize = 0;
    static int[] dRow = {1,0};
    static int[] dCol = {0,1};
    static boolean success = false;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        rowSize = sc.nextInt(); colSize = sc.nextInt();

        map = new int[rowSize][colSize];

        for(int i = 0 ;i<rowSize;i++){
            for(int j = 0 ;j<colSize;j++){
                map[i][j] = sc.nextInt();
            }
        }

        dfs(0,0);

        System.out.print(success ? 1 : 0);


    }

    public static void dfs(int row, int col){

        if(row == rowSize-1 && col == colSize-1){
            success = true;
            return;
        }

        for(int i = 0;i<2;i++){
            
            if(canGo(row+dRow[i],col+dCol[i])){
                
                dfs(row+dRow[i],col+dCol[i]);
            }
        }

    }

    public static boolean canGo(int row, int col){
        return row >= 0 && col >= 0&& row <rowSize && col < colSize && map[row][col] != 0;
    }

}