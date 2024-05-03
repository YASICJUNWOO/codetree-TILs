import java.util.*;

public class Main {

    static int n = 0;
    static List<Integer> li = new ArrayList<>();
    static int cnt = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        li.add(0);
        makePer(1,0,0);

        System.out.print(cnt);

    }

    public static void makePer(int idx, int prevNum, int count){

        if(idx == n+1){
            if(prevNum == count){
                cnt++;
            }
            return;
        }

        for(int i = 1 ; i <= 4 ; i++){

            //다른 수로 넘어갈 때
            if(i != prevNum && prevNum == count){
                li.add(i);
                makePer(idx+1, i , 1);
                li.remove(li.size() - 1);
            }
            else if( i == prevNum){
                if(prevNum == count){
                    li.add(i);
                    makePer(idx+1, i, 1);
                    li.remove(li.size() - 1);
                }
                else{
                    li.add(i);
                    makePer(idx+1, i , count+1);
                    li.remove(li.size() - 1);
                }
            }
        }

    }

    public static void print(){
        for(int i =1; i<li.size() ;i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println();
    }
}