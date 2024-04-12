import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(Systrm.in);

        int n = sc.next();

        for(int i =0;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}