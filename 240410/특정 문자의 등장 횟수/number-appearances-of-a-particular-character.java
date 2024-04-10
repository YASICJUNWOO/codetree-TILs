import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  =new Scanner(System.in);

        String str = sc.next();

        int eeSum = 0, ebSum = 0;

        for(int i = 0;i<str.length()-1;i++){

            String check =str.substring(i,i+2);

            System.out.print(check);
            if(check.equals("ee")){
                eeSum++;
            }

            if(str.substring(i,i+1).equals("eb")){
                ebSum++;
            }
        }

        System.out.print(eeSum +" "+ebSum);
    }
}