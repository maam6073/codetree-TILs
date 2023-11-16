import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,-1,0,1};
    public static int x = 0 , y = 0;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int dirNum = 3;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L')
                dirNum = (dirNum - 1 + 4) % 4;
            else if(s.charAt(i) == 'R')
                dirNum = (dirNum + 1) % 4;
            else if(s.charAt(i) == 'F'){
                x += dx[dirNum];
                y += dy[dirNum]; 
            }
        }
        System.out.print(x+" "+y);
    }
}