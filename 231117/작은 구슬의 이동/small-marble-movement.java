import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 50;
    public static int[][] arr = new int[MAX_N+1][MAX_N+1];
    public static int[] dx = new int[]{0,-1,1,0};
    public static int[] dy = new int[]{1,0,0,-1};
    public static int n,t,r,c,dirNum;
    public static char d;

    private static boolean inRange(int x, int y){
        return ((x > 0 && x < n) || (y > 0 && y < n));
    }

    private static int getDir(char d){
        if(d == 'U')
            return 1;
        else if(d == 'D')
            return 2;
        else if(d == 'R')
            return 0;
        else
            return 3;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        t = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        r = Integer.parseInt(s[0])-1;
        c = Integer.parseInt(s[1])-1;
        d = s[2].charAt(0);
        dirNum = getDir(d);


        int nx = r , ny = c;
        for(int i = 0; i < t; i++){
            nx += nx >= 0 ? dx[dirNum] : 0;
            ny += ny >= 0 ? dy[dirNum] : 0;
            if(!inRange(nx,ny)){
                dirNum = 3 - dirNum;
                i++;
            }
        }

        System.out.print((nx+1) +" "+ (ny+1));
    }
}