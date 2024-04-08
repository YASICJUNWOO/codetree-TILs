import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if( a >= b && a >=c){
            System.out.print(b>c? b:c);
        }
        else if( b >= a && b >=c){
            System.out.print(a>c? a:c);
        }
        else{
System.out.print(a>b? a:b);
        }
    }
}