import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int i =0;i<n;i++){
            int input = sc.nextInt();
            arr.add(input);
        }

        int maxVal = Integer.MIN_VALUE;


        for(int i = 0;i<=n-k;i++){

            int sum = 0;
            for(int j = i ; j<k+i; j ++){
                sum += arr.get(j);
            }
            

            maxVal = Math.max(maxVal,sum);
        }

        System.out.print(maxVal);
    }


}