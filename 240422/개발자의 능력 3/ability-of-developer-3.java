import java.util.*;

public class Main {

    static int[] arr = new int[6];
    static int totalSum = 0;
    static int minVal = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        //초기화
        for(int i =0;i<6;i++){
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        for(int i = 0; i<6 ;i++){
            for(int j = i+1;j<6;j++){
                for(int k = 0; k<6;k++){
                    round(i,j,k);
                }
            }
        }

        System.out.print(minVal);
    }

    public static void round(int first, int second, int third){
        int sum1 = arr[first]+arr[second]+arr[third];
        int gap = Math.abs(totalSum-sum1-sum1);
        minVal = Math.min(minVal, gap);
    }

}