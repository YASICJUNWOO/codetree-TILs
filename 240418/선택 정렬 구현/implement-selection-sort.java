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

        for(int i = 0;i<n-1;i++){
            int min = i;

            for(int j = i+1 ; j<n ; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}