import java.util.*;

public class Main {
    
    public static int digit(int num){

        int cnt = 1;

        while(num/cnt > 0){
            cnt*=10;
        }

        return cnt/10;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();

        int maxVal = Integer.MIN_VALUE;

        

        for(int i = x; i<=y;i++){

            int sum = 0;
            int num = i;

            int d = digit(i); 
            

            while(num>=10){
                sum += num/d;
                num %= d;
                d /= 10;
            }

            sum += num;

            maxVal = Math.max(maxVal, sum);
        }

        System.out.print(maxVal);
    }
}