import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        print(n);
        System.out.println();
        reversePrint(n);
    }

    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }

    public static void reversePrint(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        reversePrint(n-1);
    }
}