import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int[] arr = new int[target+1];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 1;

        for(int i = 3 ; i<=target ;i++){
            arr[i] = (arr[i-2]+arr[i-3])%10007;
        }

        System.out.print(arr[target]);
    }
}