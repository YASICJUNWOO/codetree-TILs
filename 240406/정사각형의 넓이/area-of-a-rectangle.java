import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(n*n);

        if(n<5){
            System.out.print("\ntiny");
        }
    }
}