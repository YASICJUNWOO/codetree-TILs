import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        char[] arr = str.toCharArray();

        int com = sc.nextInt();

        while(com-->0){
            int input = sc.nextInt();

            if(input == 1 ){
                int idx1 = sc.nextInt()-1, idx2 = sc.nextInt()-1;

                char temp = arr[idx1];
                arr[idx1] = arr[idx2];
                arr[idx2] = temp;

                System.out.println(String.valueOf(arr));
            }

            else{
                char ch1 = sc.next().charAt(0), ch2 = sc.next().charAt(0);

                for(int i =0 ;i<len;i++){
                    if(arr[i]==ch1){
                        arr[i] = ch2;
                    }
                }

                System.out.println(String.valueOf(arr));
            }

        }
    }
}