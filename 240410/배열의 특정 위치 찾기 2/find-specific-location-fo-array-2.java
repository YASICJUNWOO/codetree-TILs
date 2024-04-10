import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  =new Scanner(System.in);

        int cnt = 1;

        int evenSum = 0, oddSum = 0;

        for(;cnt<=10;cnt++){

            int input = sc.nextInt();

            if(cnt%2==0){
                evenSum += input;
            }
            else{
                oddSum += input;
            }

        }

        System.out.print( evenSum > oddSum ? evenSum - oddSum : oddSum-evenSum);
    }
}