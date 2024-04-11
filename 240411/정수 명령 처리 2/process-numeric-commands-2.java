import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Queue<Integer> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            String command = sc.next();

            if(command.equals("push")){
                int input = sc.nextInt();
                q.add(input);
            }
            else if(command.equals("pop")){
                System.out.println(q.poll());
            }
            else if(command.equals("size")){
                System.out.println(q.size());
            }
            else if(command.equals("empty")){
                System.out.println(q.isEmpty() ? 1 : 0);
            }
            else{
                System.out.println(q.peek());
            }
        }
    }
}