import java.util.*;

public class Main {

    public static int n = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        printStar(1);
    }
    
    public static void printStar(int num){
        
        if(num > n){
            return;
        }

        for(int i = 0; i<num;i++){
            System.out.print("*");
        }
        System.out.println();

        printStar(num+1);

    }
}