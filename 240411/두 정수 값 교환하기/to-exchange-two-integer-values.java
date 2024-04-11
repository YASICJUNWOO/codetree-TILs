import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        IntWrapper a = new IntWrapper(n);
        IntWrapper b = new IntWrapper(m);

        swap(a,b);

        System.out.print(a.value+" "+b.value);
    }

    public static void swap(IntWrapper n, IntWrapper m){
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }

}