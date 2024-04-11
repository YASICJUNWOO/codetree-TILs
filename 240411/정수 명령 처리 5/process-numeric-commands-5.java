import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        while(n-->0){
            String commmand = sc.next();

            if(commmand.equals("push_back")){
                int input = sc.nextInt();
                arr.add(input);
            }
            else if(commmand.equals("pop_back")){
                arr.remove(arr.size()-1);
            }
            else if(commmand.equals("size")){
                System.out.println(arr.size());
            }
            else{
                int input = sc.nextInt();
                System.out.println(arr.get(input-1));
            }

        }
    }
}