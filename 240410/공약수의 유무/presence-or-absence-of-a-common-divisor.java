import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        boolean check = false;

        for(;a<=b;a++){
            if(1920%a==0 && 2880%a==0){
                check = true;
            }
        }

        System.out.print(check ? 1 : 0);
    }
}