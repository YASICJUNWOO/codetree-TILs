import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String state1, state2, state3;
        int tem1, tem2, tem3;

        state1 = sc.next();
        tem1 = sc.nextInt();
        state2 = sc.next();
        tem2 = sc.nextInt();
        state3 = sc.next();
        tem3 = sc.nextInt();

        int cnt = 0;

        if(state1.equals("Y")){
            if(tem1 >= 37){
                cnt++;
            }
        }
        if(state2.equals( "Y")){
            if(tem2 >= 37){
                cnt++;
            }
        }
        if(state3.equals("Y")){
            if(tem3 >= 37){
                cnt++;
            }
        }

        if(cnt >=2){
            System.out.print("E");
        }
        else{
            System.out.print("N");
        }

    }
}