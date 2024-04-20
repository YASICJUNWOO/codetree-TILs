import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        int cnt = 0;

        for(int i = a;i<=b;i++){
            if(isContain(i) || isMulti(i)){
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    //3,6,9가 들어가 있는지
    public static boolean isContain(int num){
        String str = Integer.toString(num);
        return str.contains("3") || str.contains("6") ||str.contains("9");
    }

    //3의 배수 인지
    public static boolean isMulti(int num){
        return num%3 == 0;
    }
}