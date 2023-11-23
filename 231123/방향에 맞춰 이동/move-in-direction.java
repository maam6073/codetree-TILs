import java.util.*;
import java.io.*;

public class Main {
    private static int[] dx = new int[]{0,1,0,-1};
    private static int[] dy = new int[]{1,0,-1,0};
    private static int dirNum,n;


    private static boolean inRange(int x, int y){
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][n];
        int x=0,y=0; 
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            char d = s[0].charAt(0);
            int m = Integer.parseInt(s[1]);
            
            if(d == 'E')
                dirNum = 0;
            else if(d == 'S')
                dirNum = 1;
            else if(d == 'W')
                dirNum = 2;
            else if(d == 'N')
                dirNum = 3;
            
            for(int j = 0; j < m; j++){
                x = x + dx[dirNum];
                y = y + dy[dirNum];
                if(inRange(x,y))
                    arr[x][y] ++;
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