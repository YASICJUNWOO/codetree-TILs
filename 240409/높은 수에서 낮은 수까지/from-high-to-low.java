import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        int bigNum = a, smallNum = b;
        if(a<b){
            bigNum = b;
            smallNum = a;
        }

        for(int i = bigNum ; i >= smallNum ; i--){
            System.out.print(i+" ");
        }

    }
}