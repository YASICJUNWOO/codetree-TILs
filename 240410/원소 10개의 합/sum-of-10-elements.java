import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  = new Scanner(System.in);

        int idx = 10;

        int sumVal = 0;

        while(idx-->0){
            int input = sc.nextInt();

            sumVal+=input;
        }

        System.out.print(sumVal);
    }
}