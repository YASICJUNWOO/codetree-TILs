import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int idx =10, sumVal = 0, cnt =0;

        while(idx-->0){
            int input = sc.nextInt();

            if(input==0){
                break;
            }

            if(input%2==0){
                sumVal+= input;
                cnt++;
            }
            
        }

        System.out.print(cnt+" "+sumVal);
    }
}