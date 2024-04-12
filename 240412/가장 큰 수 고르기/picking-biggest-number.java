import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int MAX_VAL = Integer.MIN_VALUE;

        for( int i =0;i<10;i++){
            int input = sc.nextInt();
            if(input > MAX_VAL){
                MAX_VAL = input;
            }
        }

        System.out.print(MAX_VAL);
    }
}