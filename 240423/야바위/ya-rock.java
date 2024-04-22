import java.util.*;

public class Main {

    static int size = 0;
    static int[][] turn;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        turn = new int[size][3];

        for(int i =0;i<size;i++){
            turn[i][0] = sc.nextInt()-1;
            turn[i][1] = sc.nextInt()-1;
            turn[i][2] = sc.nextInt()-1;
        }

        int maxScore = Integer.MIN_VALUE;

        for(int i = 0;i<3;i++){
            maxScore = Math.max(maxScore,getCnt(i));
        }

        System.out.print(maxScore);

    }
    
    public static int getCnt(int idx){
        int targetCup = idx;
        int cnt = 0;

        for(int i =0;i<size;i++){
            int cup1 = turn[i][0];
            int cup2 = turn[i][1];
            int openCup = turn[i][2];

            if(targetCup == cup1){
                targetCup = cup2;
            }
            else if(targetCup == cup2){
                targetCup = cup1;
            }

            if(openCup == targetCup){
                cnt++;
            }
        }

        return cnt;
    }

}