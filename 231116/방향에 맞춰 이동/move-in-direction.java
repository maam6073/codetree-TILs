import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,-1,0,1};
    public static int x = 0 , y = 0;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            char d = s[0].charAt(0);
            int m = Integer.parseInt(s[1]);

            for(int j = 0; j < m; j++){
                if(d == 'N')
                    y = y + dy[3];
                else if(d == 'E')
                    x = x + dx[0];
                else if(d == 'S')
                    y = y + dy[1];
                else if(d == 'W')
                    x = x + dx[2];
            }
        }
        System.out.print(x+" "+y);
    }
}