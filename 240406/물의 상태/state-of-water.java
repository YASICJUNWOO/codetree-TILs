import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int tem = sc.nextInt();

        String type;

        if(tem < 0 ){
            type = "ice";
        }
        else (tem>=100){
            type = "vapor";
        }
        else{
            type = "water";
        }

        System.out.print(type);
    }
}