import java.util.Scanner;

class Spy{
    String code;
    String arrd;
    int time;

    public Spy(String code, String arrd, int time){
        this.code = code;
        this.arrd = arrd;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String code, arrd;
        int time;

        code = sc.next();
        arrd = sc.next();
        time = sc.nextInt();

        Spy spy = new Spy(code, arrd, time);

        System.out.println("secret code : "+spy.code);
        System.out.println("meeting point : "+spy.arrd);
        System.out.println("time : "+spy.time);
    }
}