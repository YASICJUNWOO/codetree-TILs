import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1;i<= n;i++){

            int result = -1;
            if(i%3==0){
                result = 0;
            }
            else{
                int num = i;
                int check;

                while(num>10){
                    check = num/10;
                    if(check == 3 || check == 6 || check ==9){
                        result = 0;
                        break;
                    }
                    num %= 10;
                }

                if(num == 3 || num == 6 || num ==9){
                    result = 0;
                }

            }

            System.out.print(result == 0 ? "0 " : i+" ");
        }
    }
}