import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int age1, age2;
        String gender1, gender2;

        age1 = sc.nextInt();
        gender1 = sc.next();
        age2 = sc.nextInt();
        gender2 = sc.next();


        if( age1 >= 19 && gender1.equals("M")){
            System.out.print(1);
        }
        else if( age2 >= 19 && gender2.equals("M") ){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}