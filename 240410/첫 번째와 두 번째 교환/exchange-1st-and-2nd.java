import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length();

        char first = str.charAt(0), second = str.charAt(1);

        char[] arr = str.toCharArray();

        for(int i =0;i<len;i++){
            if(arr[i] == first){
                arr[i] = second;
            }
            else if(arr[i]==second){
                arr[i] =first;
            }
        }

        System.out.print(String.valueOf(arr));
    }
}