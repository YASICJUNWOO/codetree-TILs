import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = n;

        List<Integer> arr = new ArrayList<>();

        while(idx-->0){
            int input = sc.nextInt();
            arr.add(input);
        }

        int cnt = 0;

        for(int i = 0 ; i < n-2;i++){
            int first = arr.get(i);

            for(int j = i+1 ; j<n-1;j++){
                int second = arr.get(j);
                
                if(second<first){
                    continue;
                }

                for(int s = j+1; s<n;s++){
                    int third = arr.get(s);

                    if(second<=third){
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}