import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str =sc.next();

        int len = str.length();

        while(len>1){
            int idx = sc.nextInt();

            String result ="";

            if(idx > len){
                result = str.substring(0,len-1);
            }
            else{
                result = str.substring(0,idx) + str.substring(idx+1);
            }
            

            System.out.println(result);
            str = result;
            len--;
        }
    }
}