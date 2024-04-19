import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String[] stArr = sc.next().split("");
        Stack st = new Stack<>();

        boolean isValid = true;

        for(String str : stArr){
            if(str.equals("(")){
                st.push(str);
            }
            else{
                if(st.isEmpty()){
                    isValid = false;
                    break;
                }

                st.pop();
            }
        }

        if(!st.isEmpty()){
            isValid=false;
        }

        System.out.print(isValid ? "Yes":"No");
    }
}