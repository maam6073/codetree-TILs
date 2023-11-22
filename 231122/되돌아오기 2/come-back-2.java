import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static int[] dx = new int[]{0,1,0,-1};
    private static int[] dy = new int[]{1,0,-1,0};
    private static int dirNum = 3;
    private static int sP;
    private static int x,y;
    private static int result = -1;

    private static boolean inRange(int x,int y){
        return x >= 0 && x < n && y >= 0 && y < n;
    }
    

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = s.length();
        sP = (n/2) -1;
        x = sP;
        y = sP;
        int time = 0;
    
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'F'){
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];
                x = nx;
                y = ny;
            }
            else if(s.charAt(i) == 'R')
                dirNum = (dirNum + 1) % 4;
            else if(s.charAt(i) == 'L'){
                dirNum --;
                dirNum = dirNum < 0 ? 3 : dirNum;
            }

            if(inRange(x,y))
                time = i+1;
            
            if(i != 0 && x == sP && y == sP){
                result = time;
                break;
            }
        }

        System.out.print(result);
    }
}