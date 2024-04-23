import java.util.*;

class Point{
    int row;
    int col;

    public Point(int row, int col){
        this.row = row;
        this.col= col;
    }
}

public class Main {

    static int[][] map;
    static int rowSize = 0, colSize = 0;
    static Queue<Point> q = new LinkedList<>();
    static boolean[][] visit;

    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  = new Scanner(System.in);
        rowSize = sc.nextInt(); colSize = sc.nextInt();

        map = new int[rowSize][colSize];
        visit = new boolean[rowSize][colSize];

        for(int i = 0 ; i<rowSize ;i++){
            for(int j = 0 ; j<colSize ; j++){
                map[i][j] = sc.nextInt();
            }
        }

        q.add(new Point(0,0));
        System.out.print(bfs() ? 1 : 0);
        
    }

    public static boolean bfs(){

        while(!q.isEmpty()){
            
            Point p = q.poll();
            int row = p.row;
            int col = p.col;

                if(row == rowSize-1 && col == colSize-1){
                    return true;
                }

            for(int i =0;i<4;i++){
                int moveRow = row + dRow[i];
                int moveCol = col + dCol[i];

                if(canGo(moveRow,moveCol)){
                    visit[moveRow][moveCol] = true;
                    q.add(new Point(moveRow,moveCol));
                }
            }

        }

        return  false;
    }

    public static boolean canGo(int row, int col){
        return row>=0 && col>=0 && row<rowSize && col < colSize && map[row][col] != 0 && !visit[row][col];
    }

}