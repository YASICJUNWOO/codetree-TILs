import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while(!str.equals("END")){
            
            for(int i = str.length()-1 ;i>=0;i--){
                System.out.print(str.charAt(i));
            }
            System.out.println();
            str = sc.next();
        }
    }
}