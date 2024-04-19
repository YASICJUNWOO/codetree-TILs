import java.util.*;

public class Main {

    private static final int MAX_SIZE = 100000;
    private static final int[] arr = new int[MAX_SIZE];
    static int n = 0;

    public static void sort(){

        int a = 1;

        //최대 자리수
        for(int pos = 0;pos<6;pos++){

            ArrayList<Integer>[] li = makeArray();

            for(int i = 0 ;i < n ; i++){
                int digit = (arr[i]/a)%10;
                li[digit].add(arr[i]);
                
            }

            int idx = 0;
            for(ArrayList<Integer> l : li){
                
                for(int i = 0 ; i<l.size();i++){
                    
                    arr[idx] = l.get(i);
                    idx++;
                }
                
            }

            a*=10;
        }

    }

    public static ArrayList<Integer>[] makeArray(){
        ArrayList<Integer>[] li = new ArrayList[10];

        for(int i = 0 ; i<10;i++){
            li[i] = new ArrayList<>();
        }

        return li;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sort();

        for(int i =0 ; i<n ; i ++){
            System.out.print(arr[i]+" ");
        }



    }
}