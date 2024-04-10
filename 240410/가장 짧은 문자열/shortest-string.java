import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(), str2 = sc.next(), str3 = sc.next();

        int length1 = str1.length(), length2 = str2.length(), length3 = str3.length();

        if(length1 >= length2 && length1>=length3){
            if(length2 >= length3){
                System.out.print(length1-length3);
            }
            else{
                System.out.print(length1 - length2);
            }
        }
        else if( length2 >= length1 && length2 >= length3){
            if(length1 >= length3){
                System.out.print(length2-length3);
            }
            else{
                System.out.print(length2 - length1);
            }
        }
        else{
            if(length1 >= length2){
                System.out.print(length3-length2);
            }
            else{
                System.out.print(length3 - length1);
            }
        }
    }
}