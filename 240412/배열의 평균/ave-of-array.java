import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        int[] garoAvg = new int[2];
        int[] seroAvg = new int[4];
        int totalAvg = 0;

        for(int i = 0;i<2;i++){
            for(int j = 0;j<4;j++){
                int input = sc.nextInt();
                garoAvg[i]+=input;
                seroAvg[j]+=input;
                totalAvg+=input;
            }
        }

        System.out.println(garoAvg[0]/4.0+" "+garoAvg[1]/4.0);
        
        for(int i =0;i<4;i++){
            System.out.print(seroAvg[i]/2.0+" ");
        }
        System.out.println();
        System.out.print(totalAvg/8.0);
    }
}