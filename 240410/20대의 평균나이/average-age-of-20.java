import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int cnt = 0, sumValue = 0;

        while(true){
            int input = sc.nextInt();

            
            if(input>=30){
                break;
            }
            
            cnt++;
            sumValue += input;

        }

        System.out.printf("%.2f",(double)sumValue/cnt);
    }
}