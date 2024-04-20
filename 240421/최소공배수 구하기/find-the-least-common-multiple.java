import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt(), m = sc.nextInt();

        System.out.print(n*m/gcd(n,m));
    }

    public static int gcd(int a, int b){
        if(a%b == 0 ){
            return b;
        }
        
        return gcd(b,a%b);
    }
}