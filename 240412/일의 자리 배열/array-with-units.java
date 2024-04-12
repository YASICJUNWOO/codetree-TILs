import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int pp = sc.nextInt();
        System.out.print(p+" ");
        System.out.print(pp+" ");

        for(int i =2;i<10;i++){
            int temp = (p + pp)%10;
            p = pp;
            pp = temp;
            System.out.print(pp+" ");
        }

    }
}