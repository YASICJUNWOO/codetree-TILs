import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if(y == 2){
            System.out.print(28);
        }
        else if(y<=7){
            if(y%2==0){
                System.out.print(30);
            }
            else{
                System.out.print(31);
            }
        }
        else{
            if(y%2==0){
                System.out.print(31);
            }
            else{
                System.out.print(30);
            }
        }
    }
}