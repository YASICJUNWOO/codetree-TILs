import java.util.*;

public class Main {

    static int[] len;
    static int n = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[] arr = new int[n];
        len = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        inital();

        int result = 1;

        for(int i = 1;i<n;i++){

            int currentNum = arr[i];

            int maxLen = 0;

            //자신보다 낮은 수
            //중 최대 길이
            for(int j = i-1; j>=0 ;j--){
                if(arr[j] < currentNum && maxLen < len[j]){
                    maxLen = len[j];
                }
            }

            len[i] = maxLen + 1;
            System.out.print(len[i]+" ");

            if(result < len[i]){
                result = len[i];
            }
        }

        
        System.out.print(result);

    }

    public static void inital(){
        for(int i = 0 ;i<n;i++){
            len[i] = 1;
        }
    }
}