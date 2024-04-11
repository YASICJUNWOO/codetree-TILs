import java.util.Scanner;

public class Main {

    static int[] visit;
    static int cnt = 0;
    static int n;
    static int[][] arr;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int m = sc.nextInt();

        visit = new int[n+1];

        arr = new int[n+1][n+1];

        for(int i =0;i<m;i++){
            int idx1 = sc.nextInt();
            int idx2 = sc.nextInt();

            arr[idx1][idx2] = 1;
            arr[idx2][idx1] = 1;
        }

        visit[1] = 1;
        dfs(1);

        System.out.print(cnt);

        
    }

    public static void dfs(int idx){
        for(int i = 0; i<=n ;i++){
            if(arr[idx][i] == 1 && visit[i] == 0){
                cnt++;
                visit[i] = 1;
                dfs(arr[idx][i]);
            }
        }
    }
}