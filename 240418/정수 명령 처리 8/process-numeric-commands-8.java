import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> arr = new LinkedList<>();

        while(n-->0){
            String com = sc.next();

            if(com.equals("push_front")){
                int input = sc.nextInt();
                arr.addFirst(input);
            }
            else if(com.equals("push_back")){
                int input = sc.nextInt();
                arr.addLast(input);
            }
            else if(com.equals("pop_front")){
                System.out.println(arr.pollFirst());
            }
            else if(com.equals("pop_back")){
                System.out.println(arr.pollLast());
            }
            else if(com.equals("size")){
                System.out.println(arr.size());
            }
            else if(com.equals("empty")){
                System.out.println(arr.isEmpty() ? 1 : 0);
            }
            else if(com.equals("front")){
                System.out.println(arr.peekFirst());
            }
            else if(com.equals("back")){
                System.out.println(arr.peekLast());
            }
        }
    }
}