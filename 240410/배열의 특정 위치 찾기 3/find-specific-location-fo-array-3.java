import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        int[] arr = new int[100];

        for(;cnt<100;cnt++){
            arr[cnt] = sc.nextInt();

            if(arr[cnt]==0){
                break;
            }
        }

        System.out.print(arr[cnt-1]+arr[cnt-3]+arr[cnt-2]);
    }
}