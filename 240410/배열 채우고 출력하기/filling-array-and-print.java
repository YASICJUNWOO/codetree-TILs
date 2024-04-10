import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int idx = 10;

        char[] arr = new char[10];


        while(idx-->0){
            arr[idx] = sc.next().charAt(0);
        }

        for(int i =0;i<10;i++){
            System.out.print(arr[i]);
        }
    }
}