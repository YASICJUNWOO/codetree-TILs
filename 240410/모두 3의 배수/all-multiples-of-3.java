import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int idx = 5;

        boolean check = true;

        while(idx-->0){
            int input = sc.nextInt();

            if(input%3!=0){
                check = false;
            }
        }

        System.out.print(check ? 1 : 0);
    }
}