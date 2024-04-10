import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[200];

        int cnt = -1;

        String str = sc.next();

        while(!str.equals("0")){
            cnt++;
            arr[cnt] = str;
            str = sc.next();
        }

        System.out.println(cnt+1);

        for(int i = 0 ;i<=cnt;i+=2){
            System.out.println(arr[i]);
        }
    }
}