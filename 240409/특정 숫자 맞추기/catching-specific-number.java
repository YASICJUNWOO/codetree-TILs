import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        while(true){
            int input = sc.nextInt();

            if(input<25){
                System.out.println("Higher");
            }
            else if(input>25){
                System.out.println("Lower");
            }
            else{
                System.out.println("Good");
                break;
            }
        }
    }
}