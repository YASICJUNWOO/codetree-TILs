import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length();

        char[] arr = str.toCharArray();
        
        char target = arr[1], change = arr[0];

        for(int i=0;i<len;i++){
            if(arr[i]==target){
                arr[i] = change;
            }
        }

        System.out.print(String.valueOf(arr));
    }
}