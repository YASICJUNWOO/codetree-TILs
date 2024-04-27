import java.util.*;

public class Main {

    static int MAX_SIZE = 100000;
    static int[] arr;
    static int points = 0, ranges = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        points = sc.nextInt();
        ranges = sc.nextInt();

        arr = new int[MAX_SIZE+1];
        for(int i = 0 ;i<points;i++){
            int point = sc.nextInt();
            arr[point] = 1;
        }

        //dp
        init();
        //debug();

        for(int i = 0 ;i<ranges;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(arr[end] - arr[start-1]);
        }

    }

    public static void init(){

        for(int i = 1 ;i<=MAX_SIZE;i++){
            arr[i] += arr[i-1];
        }

    }

    public static void debug(){
        for(int i = 1 ;i<=MAX_SIZE;i++){
            if(arr[i] >= 1){
                System.out.println(i+" "+arr[i]);
            }
        }
    }

}