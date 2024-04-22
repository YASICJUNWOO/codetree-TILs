import java.util.*;

public class Main {

    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int rowSize = 0;
    static int colSize = 0;
    static int[][] map;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        rowSize = sc.nextInt();
        colSize = sc.nextInt();

        map = new int[rowSize][colSize];

        int endVal = rowSize*colSize;

        int x = 0, y = 0;
        int direction = 0;

        map[0][0] = 1;

        for(int i = 2 ;i<= endVal;i++){
            int moveX = x + dx[direction];
            int moveY = y + dy[direction];
            

            if(!canGo(moveY, moveX)  || map[moveY][moveX] != 0){
                direction = (direction + 1) % 4;
                moveX = x + dx[direction];
                moveY = y + dy[direction];
            
            }

            x = moveX;
            y = moveY;
            
            map[moveY][moveX] = i;

        }

        print();
   }

    public static boolean canGo(int row, int col){
        return row >=0 &&col>=0&& row < rowSize && col < colSize;
    }

    public static void print(){
        for(int row = 0; row < rowSize;row++){
            for(int col = 0 ;col<colSize;col++){
                System.out.print(map[row][col]+" ");
            }
            System.out.println();
        }
    }
}