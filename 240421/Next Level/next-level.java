import java.util.*;


class Info{
    String id;
    int level;

    public Info(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        Info info1 = new Info("codetree", 10);
        Info info2 = new Info("hello", 28);

        System.out.println("user "+ info1.id +" lv "+info1.level);
        
        
        System.out.println("user "+ info2.id +" lv "+info2.level);    }
}