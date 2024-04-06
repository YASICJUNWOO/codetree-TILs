import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int Amath, Aenglish;
        int Bmath, Benglish;

        Amath = sc.nextInt();
        Aenglish = sc.nextInt();
        Bmath = sc.nextInt();
        Benglish = sc.nextInt();

        System.out.print( Amath > Bmath && Aenglish > Benglish ? 1 : 0);
    }
}