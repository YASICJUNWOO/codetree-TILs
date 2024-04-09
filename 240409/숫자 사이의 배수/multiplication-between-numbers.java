import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        int a =sc.nextInt(), b = sc.nextInt();

        int cnt = 0, sumValue = 0;

        for(;a<=b;a++){

            if(a%5==0 || a%7 ==0){
                sumValue+=a;
                cnt++;
            }
        }

        System.out.printf("%d %.1f",sumValue,(double)sumValue/cnt);
    }
}