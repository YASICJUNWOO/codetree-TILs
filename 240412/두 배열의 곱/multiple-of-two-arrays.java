import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                int input = sc.nextInt();
                arr[i][j] = input;
            }
        }

        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                int input = sc.nextInt();
                arr2[i][j] = input;
            }
        }

        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr[i][j]*arr2[i][j]+" ");
            }
            System.out.println();
        }


    }
}