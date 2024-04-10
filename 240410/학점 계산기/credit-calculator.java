import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        double sumVal = 0;

        int idx = n;
        while(idx-->0){
            double input = sc.nextDouble();

            sumVal +=input;
        }

        

        double avg = sumVal/n;
        System.out.printf("%.1f\n",avg);
        if(avg >= 4.0){
            System.out.print("Perfect");
        }
        else if(avg >= 3.0){
            System.out.print("Good");
        }
        else {
            System.out.print("Poor");
        }
    }
}