import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];

        for(int i =0;i<10;i++){
            int input = sc.nextInt();
            arr[input]++;
        }

        for(int i =1;i<7;i++){
            System.out.println(i+" - "+arr[i]);
        }
    }
}