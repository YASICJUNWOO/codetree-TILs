import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str =sc.next();

        int lenIdx = str.length()-1;

        while(lenIdx>0){
            int idx = sc.nextInt();

            String result ="";

            if(idx > lenIdx){
                result = str.substring(0,lenIdx);
            }
            else{
                result = str.substring(0,idx) + str.substring(idx+1);
            }
            

            System.out.println(result);
            str = result;
            lenIdx--;
        }
    }
}