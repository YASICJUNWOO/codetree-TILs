import java.util.*;

public class Main {

    public static int sum(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.print(sum(a,b,c));
    }
}