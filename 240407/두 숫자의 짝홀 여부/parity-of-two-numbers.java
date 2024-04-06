import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        if(a%2==0){
            System.out.print("even\n");
        }
        else{
            System.out.print("odd\n");
        }

        if(b%2==0){
            System.out.print("even\n");
        }
        else{
            System.out.print("odd\n");
        }
    }
}