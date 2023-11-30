import java.util.*;
import java.io.*;

public class Main {
    private static int[] dx = new int[]{0,1,0,-1};
    private static int[] dy = new int[]{1,0,-1,0};
    private static int ch = 65;
    private static char[][] arr;
    private static int x = 0, y = 0,n,m;
    private static int dirNum = 0;
    private static boolean inRange(int x,int y){
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        int maxNM = n*m;
        arr = new char[n][m];
        arr[x][y] = (char)ch;

        while(maxNM -- > 0){
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            if(!inRange(nx,ny) || (inRange(nx,ny) && arr[nx][ny] != (char)0)){
                dirNum = (dirNum + 1) % 4;
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }

            if(arr[nx][ny] == (char)0) {
                if (ch >= 90)
                    ch = 65;
                else
                    ch++;

                arr[nx][ny] = (char) ch;

                x = nx;
                y = ny;
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