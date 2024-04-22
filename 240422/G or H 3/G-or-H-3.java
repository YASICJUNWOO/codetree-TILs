import java.util.*;

public class Main {

    static int size = 0;
    static int range = 0;
    static int[] arr;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        size = sc.nextInt();
        range = sc.nextInt();

        arr = new int[10001];

        for(int i = 0;i<size;i++){
            int idx = sc.nextInt();
            char  ch = sc.next().charAt(0);
            if(ch == 'G'){
                arr[idx-1] = 1;
            }
            else{
                arr[idx-1] =2;
            }
        }

        int maxVal = Integer.MIN_VALUE;
        for(int i = 0;i<10000-range+1;i++){
            //System.out.print( arr[i]);

            maxVal = Math.max(maxVal, sum(i));
        }

        System.out.print(maxVal);

    }

    public static int sum(int idx){
        int sum =0;
        for(int  i =idx ; i<=idx+range;i++){
            sum += arr[i];
        }
        return sum;
    }
}