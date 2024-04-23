import java.util.*;

public class Main {

    static int size = 0;
    static int[][] arr;
    static int goal = 0;


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  = new Scanner(System.in);
        size = sc.nextInt();
        goal = sc.nextInt();

        arr = new int[size][size];

        //초기화
        for(int i =0 ; i< size ; i++){
            for(int j = 0;j<size;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt =0;

        for(int i = 0;i<size;i++){
            if(checkRow(i)){
                cnt++;
            }
        }

        for(int i = 0 ;i<size;i++){
            if(checkCol(i)){
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    public static boolean checkRow(int row){

        int cnt = 1;
        int prev = 0;

        for(int idx = 0 ; idx<size;idx++){
            int checkNum = arr[row][idx];

            if(checkNum == prev){
                cnt++;
            }
            else{
                cnt = 1;
                prev = checkNum;
            }

            if(cnt == goal){
                return true;
            }
        }

        return false;
    }

    public static boolean checkCol(int col){

        int cnt = 1;
        int prev = 0;

        for(int idx = 0 ; idx<size;idx++){
            int checkNum = arr[idx][col];

            if(checkNum == prev){
                cnt++;
            }
            else{
                cnt = 1;
                prev = checkNum;
            }

            if(cnt == goal){
                return true;
            }
        }

        return false;
    }

}