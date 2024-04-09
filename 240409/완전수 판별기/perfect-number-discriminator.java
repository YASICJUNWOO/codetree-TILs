import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        int sumValue = 0;

        for(int i = 1;i<n;i++){
            if(n%i==0){
                sumValue+=i;
            }
        }


            System.out.print(sumValue==n? "P":"N");

    }
}