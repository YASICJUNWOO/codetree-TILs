import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> dq = new ArrayDeque<>();

        while(n-->0){
            String command = sc.next();

            if(command.equals("push_front")){
                int input = sc.nextInt();
                dq.addFirst(input);
            }
            else if(command.equals("push_back")){
                int input = sc.nextInt();
                dq.addLast(input);
            }
            else if(command.equals("pop_front")){
                System.out.println(dq.pollFirst());
            }
            else if(command.equals("pop_back")){
                System.out.println(dq.pollLast());
            }
            else if(command.equals("front")){
                System.out.println(dq.peekFirst());
            }
            else if(command.equals("back")){
                System.out.println(dq.peekLast());
            }
            else if(command.equals("empty")){
                System.out.println(dq.isEmpty() ? 1 : 0);
            }
            else if(command.equals("size")){
                System.out.println(dq.size());
            }
        }
    }
}