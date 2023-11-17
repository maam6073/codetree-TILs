import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = new int[]{0,1,-1,0};
    public static int[] dy = new int[]{1,0,0,-1};
    public static int n,t,r,c,dirNum;
    public static int x,y;
    public static char d;

    private static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    private static int getDir(char d){
        if(d == 'R')
            return 0;
        else if(d == 'D')
            return 1;
        else if(d == 'U')
            return 2;
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


        while(t-- > 0){
            int nx = r + dx[dirNum];
            int ny = c + dy[dirNum];
            if(inRange(nx,ny)){
                x = nx;
                y = ny;
            }
            else{
                dirNum = 3 - dirNum;
            }
        }

        System.out.print((x + 1) +" "+ (y + 1));
    }
}