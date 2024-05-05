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
            System.out.print(row+" "+col );
            return;
        }

        
        int targetNum = findMax(arr[row][col]);

        int num = findMax(arr[row][col]);

        Point p = points[num];

        round(p.row,p.col,count+1);
    }

    public static int findMax(int num){
        for(int i = num-1 ; i>=1 ;i--){
            if(nums[i]){
                return i;
            }
        }
        return -1;
    }

}