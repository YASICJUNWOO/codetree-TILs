import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        boolean isFind = false;
        for(int i = 0;i<6;i++){
            if(arr[i] == ch){
                isFind = true;
                System.out.print(i);
                break;
            }
        }
        
        if(!isFind){
            System.out.print("None");
        }
    }
}