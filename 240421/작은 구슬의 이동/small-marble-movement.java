import java.util.*;

public class Main {

    static int size = 0;
    static int[] dx = {0,1,-1,0};
    static int[] dy = {1,0,0,-1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        int t = sc.nextInt();

        int startRow = sc.nextInt()-1, startCol = sc.nextInt()-1;
        char dire = sc.next().charAt(0);

        int direct = getDirect(dire);

        for(int i = 0 ;i<t;i++){

            int targetX = startCol +dx[direct];
            int targetY = startRow + dy[direct];


            if(isRange(targetX, targetY)){
                startCol = targetX;
                startRow = targetY;
            }
            else{
                direct = 3 -direct;
            }

        }

        System.out.print(startRow+1 + " " + (startCol+1));

    }

    public static boolean isRange(int row, int col){
        return col >= 0 && row >= 0 && col < size && row < size;
    }

    public static int getDirect(char ch){
        if(ch == 'U'){
            return 3;
        }
        else if(ch == 'D'){
            return 0;
        }
        else if(ch == 'R'){
            return 1;
        }
        else{
            return 2;
        }
    }
}