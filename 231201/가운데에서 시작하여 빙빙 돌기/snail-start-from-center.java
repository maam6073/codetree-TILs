import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static int[][] arr;
    private static int[] dx = new int[]{0,-1,0,1};
    private static int[] dy = new int[]{1,0,-1,0};
    private static int x,y;
    private static int dirNum = 0;

    private static boolean inRange(int x, int y){
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        int maxN = n*n;
        int dirCheckNum = 1;
        x = n/2;
        y = n/2;
        int cnt = 0;
        arr[x][y] = 1;
        
        for(int i = 1; i <= maxN; i++){
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            
            if(inRange(nx,ny)){
                arr[nx][ny] = i+1;
                x = nx;
                y = ny;
                cnt ++;
            }

            if(cnt == dirCheckNum){
                dirNum = (dirNum+1) % 4;
                cnt = 0;

                if(i != 1 && dirNum == 2 || dirNum == 0){
                    dirCheckNum++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}