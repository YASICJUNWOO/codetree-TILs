import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a,b,c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result = a;

        if(a<=b && a<=c){
            result = a;
        }
        else if(b<=a && b<=c){
            result = b;
        }
        else if(c<=a && c<=b){
            result = c;
        }

        System.out.print(result);
    }
}