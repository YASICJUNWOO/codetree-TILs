import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int aMath, aEnglish, bMath, bEnglish;
        aMath = sc.nextInt();
        aEnglish = sc.nextInt();
        bMath = sc.nextInt();
        bEnglish = sc.nextInt();

        if(aMath == bMath){
            System.out.print( aEnglish > bEnglish ? "A" : "B");
        }
        else{
            System.out.print( aMath > bMath ? "A" : "B");
        }

    }
}