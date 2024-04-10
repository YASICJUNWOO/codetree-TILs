import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        int idx = -1;

        while(n-->0){
            int input = sc.nextInt();

            if(input%2==0){
                idx++;
                arr[idx] = input;
            }
        }

        if(idx == -1){
            System.out.print(0);
        }
        else{
            for(;idx>=0;idx--){
            System.out.print(arr[idx]+" ");
            }
        }

        
    }
}