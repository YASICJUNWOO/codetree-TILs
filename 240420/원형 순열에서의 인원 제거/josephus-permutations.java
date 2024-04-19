import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Deque<Integer> dq = new ArrayDeque<>();

        int n = sc.nextInt(), k = sc.nextInt();

        for(int i = 1 ;i<=n;i++){
            dq.addLast(i);
        }

        while(dq.size() > 0){

            for(int i = 0 ; i<k-1 ;i++){
                
                dq.addLast(dq.pollFirst());
            }

            System.out.print(dq.peekFirst()+" ");
            dq.pollFirst();
        }

    }
}