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

    static int size = 0;
    static int[][] map;
    static boolean[][] visit;

    static int endRow = 0, endCol = 0;

    static int[] dRow = {-2,-2,-1,-1,1,1,2,2};
    static int[] dCol = {-1,1,-2,2,-2,2,-1,1};

    static int cnt = -1;

    static Queue<Info> q = new LinkedList<>();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        
        size = sc.nextInt();

        map = new int[size][size];
        visit = new boolean[size][size];

        int startRow = sc.nextInt(), startCol = sc.nextInt();
        endRow = sc.nextInt() -1; endCol = sc.nextInt()-1;

        q.add(new Info(startRow-1,startCol-1,0));
        visit[0][0] = true;

        bfs();

        System.out.print(cnt == -1 ? -1 : cnt);

    }


    public static void bfs(){

        while(!q.isEmpty()){
            Info info = q.poll();
            int row = info.row;
            int col = info.col;
            int depth = info.depth;

                if(row == endRow && col == endCol){
                    cnt = depth;
                    return;
                }

            for(int i = 0 ;i<8;i++){
                int targetRow = row + dRow[i];
                int targetCol = col + dCol[i];

                //System.out.println(targetRow+" "+targetCol+" "+depth);



                if(canGo(targetRow,targetCol) && !visit[targetRow][targetCol]){
                    visit[targetRow][targetCol] = true;
                    q.add(new Info(targetRow,targetCol,depth+1));
                }
            }
        }
    }
    public static boolean canGo(int row, int col){
        return row>-1 && col >-1 && row<size && col < size;
    }
}