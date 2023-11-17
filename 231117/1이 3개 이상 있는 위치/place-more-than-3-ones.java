import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[][] arr;
    public static int[] dx = new int[]{0,1,0,-1};
    public static int[] dy = new int[]{1,0,-1,0};
    private static boolean inRange(int x, int y){
        return (x >= 0 && x < n && y >= 0 && y < n);
    }


    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        
        //2차원 배열 집어넣기
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        
        int result = 0;
        //한 인덱스씩 이동한다음
        //범위를 체크하고 주위 인덱스를 비교하여 1이 3개이상이면 카운트를 증가시켜준다.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int cnt = 0;
                for(int k = 0; k < 4; k++){
                    int x = i+dx[k];
                    int y = j+dy[k];
                    if(inRange(x,y) && arr[x][y] == 1){
                        cnt++;
                    }
                }
                if(cnt >= 3)
                    result ++;
            }
        }

        System.out.print(result);
    }
}