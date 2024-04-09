import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt2 = 0,cnt3 =0, cnt12=0;

        for(int i=1;i<=n;i++){
            if(i%12==0){
                cnt12++;
            }
            else if(i%6==0){
                cnt3++;
            }
            else if(i%3==0){
                cnt3++;
            }
            else if(i%2==0){
                cnt2++;
            }
        }

        System.out.print(cnt2+" "+cnt3+" "+cnt12 );
    }
}