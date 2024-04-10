import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int idx = -1;

        for(int i = 0;i<10;i++){

            int input = sc.nextInt();

            if(input == 0){
                break;
            }

            arr[i] = input;
            idx++;
        }

        for(int i = idx;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}