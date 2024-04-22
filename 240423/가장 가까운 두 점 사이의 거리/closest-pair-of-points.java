import java.util.*;

public class Main {

    static int[][] point;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        point = new int[n][2];

        for(int i =0;i<n;i++){
            point[i][0] = sc.nextInt();
            point[i][0] = sc.nextInt();
        }

        int closer = Integer.MAX_VALUE;

        for(int f = 0 ; f<n;f++){
            for(int s = f+1 ; s<n;s++){
                int len = getLen(f, s);  
                Math.min(closer, len);
            }
        }

        System.out.print(closer);
    }

    public static int getLen(int idx1, int idx2){
        int x1 = point[idx1][0], x2 = point[idx2][0];
        int y1 = point[idx1][1], y2 = point[idx2][1];

        return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
    }

}