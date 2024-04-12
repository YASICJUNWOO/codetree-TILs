import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        String str = sc.nextLine();

        char ch1 = str.charAt(0), ch2 = str.charAt(2);

        System.out.print(ch1+ch2 +" ");
        System.out.print(ch1>ch2 ? ch1-ch2 : ch2 -ch1);
    }
}