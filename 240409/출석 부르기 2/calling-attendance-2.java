import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        while(true){
            int input = sc.nextInt();
            String name = "";
            if(input == 1){
                name = "John";
            }
            else if(input ==2 ){
                name = "Tom";
            }
            else if(input ==3){
                name = "Paul";
            }
            else if(input ==4 ){
                name = "Sam";
            }
            else{
                System.out.print("Vacancy");
                break;
            }

            System.out.println(name);
        }
    }
}