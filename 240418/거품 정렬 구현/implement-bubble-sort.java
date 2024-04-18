import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            int input = sc.nextInt();
            arr[i] = input;
        }

        boolean sorted = false;

        do{

            sorted = true;

            for(int i =0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    sorted = false;
                }
            }
        }
        while(sorted == false);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}