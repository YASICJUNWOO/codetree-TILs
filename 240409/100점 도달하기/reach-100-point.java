import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        
        String grade = "";

        for(int i = n ;i<=100;i++){
            if(i>=90){
                grade = "A";
            }
            else if(i>=80){
                grade = "B";
            }
            else if(i>=70){
                grade = "C";
            }
            else if(i>=60){
                grade = "D";
            }
            else{
                grade = "F";
            }

            System.out.print(grade+" ");
        }
    }
}