import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        while(n-->0){
            int sumVal = 0;
            for(int i =0;i<4;i++){
                int score = sc.nextInt();
                sumVal+= score;
            }
            if( (double)sumVal/4 >= 60){
                System.out.println("pass");
                cnt++;
            }
            else{
                System.out.println("fail");
            }
        }

        System.out.print(cnt);
    }
}