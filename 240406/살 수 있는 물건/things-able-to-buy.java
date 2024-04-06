import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        String item;

        if(money >= 3000){
            item = "book";
        }
        else if (money>= 1000){
            item = "mask";
        }
        else{
            item = "no";
        }

        System.out.print(item);
    }
}