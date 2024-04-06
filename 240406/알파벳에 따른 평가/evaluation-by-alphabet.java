import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = str.charAt(0);

        String grade;

        if(ch == 'S'){
            grade = "Superior";
        }
        else if(ch == 'A'){
            grade = "Excellent";
        }
        else if(ch == 'B'){
            grade = "Good";
        }
        else if(ch == 'C'){
            grade = "Usually";
        }
        else if(ch == 'D'){
            grade = "Effort";
        }
        else {
            grade = "Failure";
        }

        System.out.print(grade);
    }
}