import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();

        int idx = 1;
        while(n>1){
            n/=idx;
            idx++; 
        }

        System.out.print(idx-1);
    }
}