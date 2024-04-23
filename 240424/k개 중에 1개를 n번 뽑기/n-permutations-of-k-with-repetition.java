import java.util.*;

public class Main {

    public static int limit = 0, time = 0;
    public static List<Integer> li = new ArrayList<>();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner  sc = new Scanner(System.in);

        limit = sc.nextInt(); time = sc.nextInt();

        fun();

    }

    public static void print(){
        for(int i : li){
            System.out.print(i +" ");
        }
        System.out.println();
    }

    public static void fun(){

        if(li.size() == time){
            print();
            return;
        }

        for(int i = 1 ; i<=limit ; i++){
            li.add(i);
            fun();
            li.remove(li.size()-1);
        }

        return;

    }
}