import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        double eye = sc.nextDouble();

        String state;

        if(eye>=1.0){
            state = "High";
        }
        else if(state>=0.5){
            state = "Middle";
        }
        else{
            state = "Low";
        }

        System.out.print(state);
    }
}