import java.util.*;

public class Main {

    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};

    static int size = 0;
    static int map[][];
    static int villige[][];
    static Scanner sc;

    static int viNum = 0;

    static Map<Integer,Integer> people = new HashMap<>();


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        sc = new Scanner(System.in);
        size = sc.nextInt();
        map = new int[size][size];
        villige = new int[size][size];
        init();

        for(int i = 0 ; i<size;i++){
            for(int j = 0;j<size;j++){

                //사람이고 방문한적 없을 때
                if(map[i][j] == 1 && villige[i][j] == 0){
                    viNum++;
                    people.put(viNum, 0);
                    dfs(i,j);
                }

            }
        }

        List<Integer> set = new ArrayList<>(people.keySet());
        set.sort((m1, m2) -> people.get(m1)-people.get(m2));

        
        System.out.println(viNum);

        for(Integer i : set){
            System.out.println(people.get(i));
        }

    }

    public static void init(){
        for(int i = 0 ; i<size;i++){
            for(int j = 0;j<size;j++){
                map[i][j] = sc.nextInt();
            }
        }
    }

    public static void dfs(int row, int col){

        villige[row][col] = viNum;
        people.put(viNum, people.get(viNum) +1 );

        for(int i = 0 ; i<4;i++){
            int targetRow = row + dRow[i];
            int targetCol = col + dCol[i];

            // 범위 유효하고, 사람이고, 마을 없을 때
            if(canGo(targetRow, targetCol) && map[targetRow][targetCol] == 1 && villige[targetRow][targetCol] == 0){
                dfs(targetRow, targetCol);
            }

        }

    }

    public static boolean canGo(int row, int col){
        return row > -1 && col > -1 && row <size && col <size;
    }
}