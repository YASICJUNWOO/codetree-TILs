import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do{
            int input = sc.nextInt();
            if(input>max){
                max = input;
            }
            if(input<min){
                min = input;
            }
        }while(input!=999 && input != -999);

        System.out.print(max+" "+min);

    }
}