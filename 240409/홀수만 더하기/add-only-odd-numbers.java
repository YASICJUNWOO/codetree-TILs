import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  =new Scanner(System.in);

        int n = sc.nextInt();

        int sumValue = 0;

        while(n-->0){
            int input = sc.nextInt();

            if(input%2!=0 && input%3==0){
                sumValue += input;
            }
        }

        System.out.print(sumValue);

    }
}