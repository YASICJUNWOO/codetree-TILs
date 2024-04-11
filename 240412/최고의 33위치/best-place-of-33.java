import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = -1;

        for(int i = 0; i<n-2 ; i++){
            for(int j = 0;j<n-2;j++){

                int sumVal = 0;

                for(int s = 0; s<3;s++){
                    for(int t = 0;t<3;t++){
                        sumVal += arr[s][t];
                    }
                }

                if(sumVal>max){
                    max = sumVal;
                }
            }
        }

        System.out.print(max);
    }
}