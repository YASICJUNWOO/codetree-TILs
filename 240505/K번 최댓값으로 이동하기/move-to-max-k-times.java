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

    static int size = 0;
    static int test = 0;

    //배열
    static int[][] arr;

    //나온 숫자
    static boolean[] nums = new boolean[101];
    
    //숫자별 좌표
    static Point[] points = new Point[101];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        test = sc.nextInt();
        arr = new int[size][size];

        for(int i = 0 ; i<size;i++){
            for(int j = 0;j<size;j++){
                int input = sc.nextInt();
                arr[i][j] = input;
                nums[input] = true;

                if(points[input] == null){
                    points[input] = new Point(i,j);
                }
                
            }
        }

        int startRow = sc.nextInt()-1, startCol = sc.nextInt()-1;

        round(startRow,startCol, 0);
    }

    public static void round(int row, int col, int count){

        if(count == test){
            System.out.print((row+1)+" "+(col+1) );
            return;
        }

        
        int targetNum = findMax(row,col);

        int num = findMax(row, col);

        if(num == -1){
            System.out.print((row+1)+" "+(col+1) );
            return;
        }

        Point p = points[num];

        round(p.row,p.col,count+1);
    }

    public static int findMax(int row, int col){
        int[] dRow = {-1,1,0,0};
        int[] dCol = {0,0,-1,1};

        int max = -1;
        for(int i = 0 ; i<4;i++){
            int targetRow = row + dRow[i];
            int targetCol = col + dCol[i];
            
            if(canGo(targetRow,targetCol) && arr[targetRow][targetCol] < arr[row][col]){
                max = Math.max(max, arr[targetRow][targetCol]);
            }
            
        }

        return max;
    }

    public static boolean canGo(int row, int col){
        return row > -1 && col > -1 && row < size && col < size;
    }

}