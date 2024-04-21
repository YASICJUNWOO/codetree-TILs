import java.util.*;

class Info{
    String name;
    int score;

    public Info(String name, int score){
        this.name = name;
        this.score = score;
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        List<Info> arr =  new ArrayList<>();

        int minScore = Integer.MAX_VALUE;

        for(int i =0 ;i<5;i++){
            String name = sc.next();
            int score = sc.nextInt();

            if(score < minScore){
                minScore = score;
            }

            arr.add(new Info(name, score));
        }

        for(int i = 0;i<5;i++){
            if(arr.get(i).score == minScore){
                System.out.print(arr.get(i).name+" "+minScore);
                break;
            }
        }

    }
}