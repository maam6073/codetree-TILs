import java.util.*;
import java.io.*;

public class Main {
    private static int n,m;
    private static int[][] arr;
    private static int[] dx = new int[]{0,1,0,-1};
    private static int[] dy = new int[]{1,0,-1,0};
    private static int x = 0, y = 0;    //현재 위치
    private static int dirNum = 0;      //방향 0 = 동, 1 = 남, 2 = 북, 3 = 서

    //배열이 범위밖으로 나가는것을 체크하는 함수
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
        int cnt = 1;
        arr[0][0] = cnt;
        for(int i = 1; i < n*m; i++){
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx,ny) || arr[nx][ny] != 0){
                dirNum = (dirNum + 1) % 4;
            }
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            arr[x][y] = cnt+i;
        
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}