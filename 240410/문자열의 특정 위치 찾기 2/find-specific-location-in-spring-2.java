import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        String str1 = "apple", str2 = "banana", str3 = "grape", str4 = "blueberry", str5 = "orange";

        int cnt =0;

        if(str1.charAt(2) == ch || str1.charAt(3) == ch){
            System.out.println(str1);
            cnt++;
        }
        if(str2.charAt(2) == ch || str2.charAt(3) == ch){
            System.out.println(str2);
            cnt++;
        }
        if(str3.charAt(2) == ch || str3.charAt(3) == ch){
            System.out.println(str3);
            cnt++;
        }
        if(str4.charAt(2) == ch || str4.charAt(3) == ch){
            System.out.println(str4);
            cnt++;
        }
        if(str5.charAt(2) == ch || str5.charAt(3) == ch){
            System.out.println(str5);
            cnt++;
        }

        if(cnt==0){
            System.out.println(0);
        }
        else{
            System.out.print(cnt);
        }
        
    }
}