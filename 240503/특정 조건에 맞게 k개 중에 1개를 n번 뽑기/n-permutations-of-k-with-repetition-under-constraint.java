import java.util.*;

public class Main {

    public static List<Integer> li = new ArrayList<>();
    static int size = 0;
    static int limit = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        limit = sc.nextInt();
        size = sc.nextInt();

        makePer(1);
    }

    public static void makePer(int idx){

        if(idx == size + 1){
            print();
            return;
        }

        for(int i = 1 ; i<=limit ;i++){
            
            if(idx >= 3 && valid(idx, i)){
                continue;
            }

            li.add(i);
            makePer(idx+1);
            li.remove(li.size() - 1);
        }
    }

    public static boolean valid(int idx, int i){
        return li.get(idx-1) == i && li.get(idx-2) == i;
    }

    public static void print(){
        for(int i = 0 ;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println();
    }
}