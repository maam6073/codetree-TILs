import java.util.*;
import java.io.*;

public class Main {
    private static int n,t;
    private static int[][] arr;
    private static int[] dx = new int[]{0,1,0,-1};
    private static int[] dy = new int[]{1,0,-1,0};
    private static int dirNum = 3;

    private static boolean inRange(int x,int y){
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String str = br.readLine();
        n = Integer.parseInt(s[0]);
        t = Integer.parseInt(s[1]);
        arr = new int[n][n];
        for(int i = 0; i < n; i++){
            s = br.readLine().split(" ");
            for(int j = 0; j < s.length; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }


        int x = n/2;
        int y = n/2;
        int result = arr[x][y];
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'R'){
                dirNum = (dirNum+1) % 4;
            }
            else if(str.charAt(i) == 'L'){
                dirNum = (dirNum-1+4) % 4;
            }
            else if(str.charAt(i) == 'F'){
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if(inRange(nx,ny)){
                    result += arr[nx][ny];
                    x = nx;
                    y = ny;
                }
            }
        }

        System.out.print(result);
    }
}