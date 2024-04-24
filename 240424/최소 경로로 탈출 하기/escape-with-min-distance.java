import java.util.*;

class Info{
    int row;
    int col;
    int depth;

    public Info(int row, int col, int depth){
        this.row = row;
        this.col = col;
        this.depth = depth;
    }
}
public class Main {

    static int rowSize = 0, colSize = 0;
    static int[][] map;
    static boolean[][] visit;
    static Queue<Info> q = new LinkedList<>();
    static int step = -1;

    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  = new Scanner(System.in);

        rowSize = sc.nextInt();
        colSize = sc.nextInt();

        map = new int[rowSize][colSize];
        visit = new boolean[rowSize][colSize];

        for(int i = 0  ;i<rowSize;i++){
            for(int j = 0;j<colSize;j++){
                map[i][j] = sc.nextInt();
            }
        }

        q.add(new Info(0,0,0));
        visit[0][0] = true;
        bfs();

        System.out.print(step == -1 ? -1 : step);
    }

    public static void bfs(){

        while(!q.isEmpty()){

            Info info = q.poll();
            int row = info.row;
            int col = info.col;
            int depth = info.depth;

            if(row == rowSize-1 && col == colSize-1){
                step = depth;
                return;
            }

            for(int i = 0 ;i<4;i++){
                int targetRow = row + dRow[i];
                int targetCol = col + dCol[i];
                

                if(canGo(targetRow,targetCol) && !visit[targetRow][targetCol]){
                    visit[targetRow][targetCol] = true;
                    q.add(new Info(targetRow,targetCol,depth+1));
                }
            }
        }

    }

    public static boolean canGo(int row, int col){
        return row>=0 && col>=0 && row<rowSize && col<colSize && map[row][col] != 0;
    }
}