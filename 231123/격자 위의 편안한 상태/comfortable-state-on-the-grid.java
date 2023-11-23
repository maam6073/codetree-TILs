import java.util.*;
import java.io.*;

public class Main {
    private static int MAX_N = 100;
    private static int n,m;
    private static int[][] arr = new int[MAX_N+1][MAX_N+1];
    private static int[] dx = new int[]{0,1,0,-1};
    private static int[] dy = new int[]{1,0,-1,0};

    private static boolean inRange(int x,int y){
        return x >= 0 && x < arr.length && y >= 0 && y < arr.length;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            s = br.readLine().split(" ");
            int r = Integer.parseInt(s[0]);
            int c = Integer.parseInt(s[1]);

            arr[r][c] = 1;
            int cnt = 0;
            
            for(int j = 0; j < 4; j++){
                int x = r + dx[j];
                int y = c + dy[j];

                if(inRange(x,y) && arr[x][y] == 1){
                    cnt++;
                }
            }

            if(cnt == 3){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }

        System.out.print(sb);

    }
}