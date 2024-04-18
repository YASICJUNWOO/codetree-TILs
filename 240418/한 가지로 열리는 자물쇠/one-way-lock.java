import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int cnt = 0;

        for(int i = 1;i<=n;i++){
            for(int j = 1 ;j<=n;j++){
                for(int s = 1;s<=n;s++){
                    if(Math.abs(a-i) <= 2 || Math.abs(b-j) <= 2 || Math.abs(c-s)<=2){
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}