import java.util.*;

class Point{
    int row;
    int col;

    public Point(int row, int col){
        this.row = row;
        this.col = col;
    }
}

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};
    static int[][] map;
    static Queue<Point> q = new LinkedList<>();
    
    static int size = 0;


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        size = sc.nextInt();
        int test = sc.nextInt();
        map = new int[size][size];

        for(int row = 0; row<size;row++){
            for(int col = 0 ;col <size ;col++){
                map[row][col] = sc.nextInt();
            }
        }

        while(test-->0){
            int startRow = sc.nextInt()-1, startCol = sc.nextInt()-1;

            if(map[startRow][startCol] == 0){
                q.add(new Point(startRow,startCol));
            }

        }

        bfs();

        int cnt = 0;

        for(int row = 0; row<size;row++){
            for(int col = 0 ;col <size ;col++){
                if(map[row][col]==2){
                    cnt++;
                }
            }
        }

        System.out.print(cnt);

    }

    public static void bfs(){

        while(!q.isEmpty()){

            Point p = q.poll();
            int r = p.row;
            int c = p.col;
            map[r][c] = 2;

            for(int i = 0 ;i<4;i++){
                int targetRow = r + dRow[i];
                int targetCol = c + dCol[i];

                if(canGo(targetRow,targetCol) && map[targetRow][targetCol] == 0){
                    q.add(new Point(targetRow,targetCol));
                }
            }

        }
        
    }

    public static boolean canGo(int row, int col){
        return row > -1 && col > -1 && row<size && col<size;
    }
}