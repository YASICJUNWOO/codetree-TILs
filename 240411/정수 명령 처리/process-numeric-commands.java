import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        int n = sc.nextInt();

        while(n-->0){
            String command = sc.next();

            if(command.equals("push")){
                int input = sc.nextInt();
                st.push(input);
            }
            else if(command.equals("pop")){
                System.out.println(st.pop());
            }
            else if(command.equals("size")){
                System.out.println(st.size());
            }
            else if(command.equals("empty")){
                System.out.println(st.isEmpty() ? 1 : 0);
            }
            else{
                System.out.println(st.peek());
            }
        }
    }
}