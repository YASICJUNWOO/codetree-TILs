import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int cnt3 = 0, cnt5 = 0;

        for (int i = 0;i<10;i++){

            int input = sc.nextInt();

            if(input %3 ==0){
                cnt3++;
            }
            if(input%5==0){
                cnt5++;
            }
        }

        System.out.printf("%d %d",cnt3,cnt5);
    }
}