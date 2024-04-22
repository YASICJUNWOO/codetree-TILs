import java.util.*;

public class Main {

    static int [][] machines;
    static int high, mid, low;
    static int size = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =  new Scanner(System.in);

        size = sc.nextInt();

        //온도별 작업량
        low = sc.nextInt();
        mid = sc.nextInt();
        high = sc.nextInt();

        int rangeLow = Integer.MAX_VALUE, rangeHigh = Integer.MIN_VALUE;

        //기계 초기화
        machines = new int[size][2];

        for(int i =0 ;i<size;i++){
            int lowTemp = sc.nextInt();
            int highTemp = sc.nextInt();

            machines[i][0] = lowTemp;
            machines[i][1] = highTemp;

            rangeLow = Math.min(rangeLow, lowTemp);
            rangeHigh = Math.max(rangeHigh, highTemp);
        }

        int maxVal = Integer.MIN_VALUE;


        //탐색 시작
        for(int temp = rangeLow-1 ; temp <= rangeHigh+1 ; temp++){
            maxVal = Math.max(maxVal, getProd(temp));
        }

        System.out.print(maxVal);
    }

    public static int getProd(int temp){
        int sum = 0;

        for(int m = 0;m<size;m++){

            if(temp < machines[m][0]){
                sum += low;
            }
            else if(temp > machines[m][1]){
                sum += high;
            }
            else{
                sum += mid;
            }

        }

        return sum;
    }

}