import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        int cnt = 0;

        while(n-->0){
            String check = sc.next();
            if(check.compareTo(str)==0){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}