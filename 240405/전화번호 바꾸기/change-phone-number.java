import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        String num1 = sc.next(), num2 = sc.next(), num3 = sc.next();

        System.out.printf("%s-%s-%s",num1,num3,num2);
    }
}