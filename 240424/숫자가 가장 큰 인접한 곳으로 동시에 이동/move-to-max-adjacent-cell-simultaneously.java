import java.util.*;

public class Main {

    static int size = 0;
    static int balls = 0;
    static int time = 0;
    static int[][] map;
    static int[][] ballCount;
    
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        balls = sc.nextInt();
        time = sc.nextInt();

        map = new int[size][size];
        ballCount = new int[size][size];

        for(int i = 0 ; i< size ; i++){
            for(int j = 0 ; j<size ; j++){
                map[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<balls;i++){
            int row = sc.nextInt();
            int col = sc.nextInt();

            ballCount[row-1][col-1] = 1;
        }

        for(int i = 0 ;i<time;i++){
            round();
            arange();
        }

        System.out.print(count());
    }

    public static void round(){
        int[][] newCount = new int[size][size];

        for(int i = 0 ;i<size;i++){
            for(int j = 0 ; j<size;j++){

                if(ballCount[i][j] == 1){

                    int row = -1, col = -1;
                    int maxVal = Integer.MIN_VALUE;

                    for(int d = 0 ; d<4;d++){
                        if(canGo(i+dy[d],j+dx[d]) && map[i+dy[d]][j+dx[d]] > maxVal){
                            row = i+dy[d];
                            col = j+dx[d];
                            maxVal = map[i+dy[d]][j+dx[d]];
                        }
                    }
                    
                    newCount[row][col] = 1;
                }

            }
        }

        ballCount =  newCount;

    }

    public static void arange(){
        for(int i = 0 ;i<size;i++){
            for(int j = 0 ; j<size;j++){
                if(ballCount[i][j] > 1){
                    ballCount[i][j] = 0;
                }
            }
        }
    }

    public static int count(){
        int cnt = 0;

        for(int i = 0 ;i<size;i++){
            for(int j = 0 ; j<size;j++){
                if(ballCount[i][j] == 1){
                    cnt++;
                }
            }
        }

        return cnt;

    }

    public static boolean canGo(int row, int col){
        return row>=0 && col>=0 && row<size && col<size;
    }

}