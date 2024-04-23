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

        System.out.print(dfs(0,0) ? 1 : 0);


    }

    public static boolean dfs(int row, int col){

        if(row == rowSize-1 && col == colSize-1){
            return true;
        }

        for(int i = 0;i<2;i++){
            
            if(canGo(row+dRow[i],col+dCol[i])){
                if(dfs(row+dRow[i],col+dCol[i])){
                    return true;
                };
            }
        }

        return false;

    }

    public static boolean canGo(int row, int col){
        return row >= 0 && col >= 0&& row <rowSize && col < colSize && map[row][col] != 0;
    }

}