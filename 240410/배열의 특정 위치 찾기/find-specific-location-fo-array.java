import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int evenSumVal = 0, sumVal3 = 0;

        int count = 0, count3 = 0;

        for(int i = 0;i<10;i++){
            int input = sc.nextInt();
            count++;
            if(count%2==0){
                evenSumVal += input;
            }
            if(count %3==0){
                sumVal3 += input;
                count3++;
            }
        }

        System.out.print(evenSumVal+" ");
        System.out.printf("%.1f", (double)sumVal3/count3);
    }
}