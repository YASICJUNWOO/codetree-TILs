import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String name;

        if(input == 1){
            name = "John";
        }
        else if(input == 2){
            name = "Tom";
        }
        else if(input == 3){
            name = "Paul";
        }
        else{
            name = "Vacancy";
        }

        System.out.print(name);
    }
}