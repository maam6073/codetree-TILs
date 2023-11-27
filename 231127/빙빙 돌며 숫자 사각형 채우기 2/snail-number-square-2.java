import java.util.*;
import java.io.*;

public class Main {
    private static int n,m;
    private static int[][] arr;
    private static int dirNum = 1;
    private static int[] dx = new int[]{0,1,0,-1};  // 0일때 동쪽 1일때 남쪽 2일때 서쪽 3일때 북쪽
    private static int[] dy = new int[]{1,0,-1,0};
    private static int x =0,y=0;

    private static boolean inRange(int x,int y){
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new int[n][m];
        arr[x][y] = 1;
        int cnt = 2;
        while((n*m) != cnt-1){
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];
                if(inRange(nx,ny) && arr[nx][ny] == 0){
                    arr[nx][ny] = cnt++;
                    x = nx;
                    y = ny;
                }
                else{
                    dirNum = (dirNum - 1 + 4) % 4;
                }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}