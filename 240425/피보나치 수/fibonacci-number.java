import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[46];

        arr[1] = 1;
        arr[2] = 1;

        int end = sc.nextInt();

        for(int i = 3 ;i<=end;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        System.out.print(arr[end]);
    }
}