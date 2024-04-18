import java.util.*;

public class Main {

    public static final int MAX_VAL = Integer.MAX_VALUE;
    public static final int MIN_VAL = Integer.MIN_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arrX = new ArrayList<>();
        List<Integer> arrY = new ArrayList<>();

    
        for(int i =0;i<n;i++){
            int x = sc.nextInt(), y = sc.nextInt();
            arrX.add(x);
            arrY.add(y);
        }

        int minArea = MAX_VAL;

        for(int i =0;i<n;i++){
            

            int maxX = MIN_VAL , minX = MAX_VAL;
            int maxY = MIN_VAL, minY = MAX_VAL;

            for(int idx = 0;idx<n;idx++){

                if(idx == i){
                    continue;
                }

                maxX = Math.max(maxX, arrX.get(idx));
                minX = Math.min(minX, arrX.get(idx));

                maxY = Math.max(maxY, arrY.get(idx));
                minY = Math.min(minY, arrY.get(idx));

            }

            minArea = Math.min(minArea,(maxY-minY)*(maxX-minX));
        }

        System.out.print(minArea);
    }
}