import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt(), b = sc.nextInt();

        int bigger = a, smaller=b;

        if(a<b){
            bigger = b;
            smaller = a;
        }

        int sumValue = 0;

        for(;smaller<=bigger;smaller++){
            if(smaller%5==0){
                sumValue+=smaller;
            }
        }

        System.out.print(sumValue);
    }
}