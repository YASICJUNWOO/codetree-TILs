import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};

    static int rowSize = 0;
    static int colSize = 0;
    static int maxHeight = -1;
    static int[][] house;
    static boolean[][] water;


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        rowSize = sc.nextInt();
        colSize = sc.nextInt();
        house = new int[rowSize][colSize];

        for(int row = 0; row <rowSize; row++){
            for(int col = 0 ; col<colSize; col++){
                int input = sc.nextInt();

                house[row][col] = input;
                maxHeight = Math.max(maxHeight, input);
            }
        }

        int maxSafe = -1;
        int maxSafeNum = -1;

        for(int k = 1 ; k<=maxHeight ; k++){
            int result = round(k);

            if(result > maxSafe){
                maxSafe = result;
                maxSafeNum = k;
            }

            
        }

        System.out.println(maxSafeNum+" "+maxSafe);

    }

    public static int round(int k){

        //true면 침수
        water = new boolean[rowSize][colSize];

        for(int row = 0; row <rowSize; row++){
            for(int col = 0 ; col<colSize; col++){
                if(house[row][col] <= k ){
                    water[row][col] = true;
                }
            }
        }

        int cnt = 0;

        for(int row = 0; row <rowSize; row++){
            for(int col = 0 ; col<colSize; col++){

                //침수 안됐을 때
                if(!water[row][col]){
                    cnt++;
                    dfs(row,col); 
                }

            }
        }

        return cnt;
    }

    public static void dfs(int row, int col){

        water[row][col] = true;

        for(int i = 0 ; i<4;i++){
            int targetRow = row + dRow[i];
            int targetCol = col + dCol[i];
            if(canGo(targetRow, targetCol) && !water[targetRow][targetCol]){
                dfs(targetRow,targetCol);
            }

        }

    }

    public static boolean canGo(int row, int col){
        return row > -1 && col > -1 && row < rowSize && col < colSize;
    }

}