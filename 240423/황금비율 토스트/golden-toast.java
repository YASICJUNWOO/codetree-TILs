import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        char[] arr = sc.next().toCharArray();

        LinkedList<Character> li = new LinkedList<>();

        for(int i = 0 ;i<arr.length;i++){
            li.add(arr[i]);
        }

        ListIterator<Character> it = li.listIterator(li.size());
        //System.out.print(it.previous());

        for(int i =0;i<m;i++){
            char com = sc.next().charAt(0);
            if(com =='L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            }
            else if(com == 'P'){
                char ch = sc.next().charAt(0);
                it.add(ch);
            }
            else if(com == 'R'){
                if(it.hasNext()){
                    it.next();
                }
            }
            else{
                if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            }
        }

        it = li.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}